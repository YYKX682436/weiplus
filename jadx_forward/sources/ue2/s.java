package ue2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f508386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2.x f508387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f508388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.graphics.Bitmap bitmap, ue2.x xVar, mm2.c1 c1Var) {
        super(0);
        this.f508386d = bitmap;
        this.f508387e = xVar;
        this.f508388f = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f508386d;
        if (bitmap != null) {
            ue2.x xVar = this.f508387e;
            xVar.f508400q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xVar.f446856d.getContext().getResources(), bitmap));
            this.f508388f.I4 = bitmap;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f384359a;
    }
}
