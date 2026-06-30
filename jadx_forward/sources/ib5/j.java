package ib5;

/* loaded from: classes14.dex */
public final class j implements ib5.e {

    /* renamed from: a, reason: collision with root package name */
    public android.renderscript.RenderScript f371802a;

    /* renamed from: b, reason: collision with root package name */
    public final android.renderscript.ScriptIntrinsicBlur f371803b;

    /* renamed from: c, reason: collision with root package name */
    public android.renderscript.Allocation f371804c;

    /* renamed from: d, reason: collision with root package name */
    public int f371805d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f371806e = -1;

    public j(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RenderScriptBlur", "rs create: %s", this);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.renderscript.RenderScript create = android.renderscript.RenderScript.create(context);
        this.f371802a = create;
        this.f371803b = android.renderscript.ScriptIntrinsicBlur.create(create, android.renderscript.Element.U8_4(create));
    }

    @Override // ib5.e
    public android.graphics.Bitmap.Config a() {
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    @Override // ib5.e
    public final android.graphics.Bitmap b(android.graphics.Bitmap bitmap, float f17) {
        android.renderscript.RenderScript renderScript = this.f371802a;
        if (renderScript == null) {
            throw new java.lang.NullPointerException("RenderScript has been destroyed!!! " + toString());
        }
        android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScript, bitmap);
        if (!(bitmap.getHeight() == this.f371806e && bitmap.getWidth() == this.f371805d)) {
            android.renderscript.Allocation allocation = this.f371804c;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f371804c = android.renderscript.Allocation.createTyped(this.f371802a, createFromBitmap.getType());
            this.f371805d = bitmap.getWidth();
            this.f371806e = bitmap.getHeight();
        }
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlur = this.f371803b;
        scriptIntrinsicBlur.setRadius(f17);
        scriptIntrinsicBlur.setInput(createFromBitmap);
        scriptIntrinsicBlur.forEach(this.f371804c);
        this.f371804c.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    @Override // ib5.e
    /* renamed from: destroy */
    public final void mo135041x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RenderScriptBlur", "destroy %s", toString());
        this.f371803b.destroy();
        android.renderscript.RenderScript renderScript = this.f371802a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f371802a = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RenderScriptBlur", "RenderScript has already been destroyed!!! %s", this);
        }
        android.renderscript.Allocation allocation = this.f371804c;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    /* renamed from: finalize */
    public void m135042xd764dc1e() {
        super.finalize();
        if (this.f371802a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RenderScriptBlur", "RS leak warning: maybe you forget to call destroy!!! %s", this);
        }
    }
}
