package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class i implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.r f70454e;

    public i(com.tencent.mm.modelavatar.r rVar, java.lang.String str) {
        this.f70454e = rVar;
        this.f70453d = str;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AvatarService#checkAvatarUpdateExpire";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f70453d.equals(this.f70454e.f70525h)) {
            return;
        }
        com.tencent.mm.modelavatar.o oVar = (com.tencent.mm.modelavatar.o) ((lt0.f) this.f70454e.f70523f).i(this.f70453d);
        if (oVar == null || com.tencent.mm.sdk.platformtools.t8.i1() - oVar.f70504a <= 21600 || com.tencent.mm.vfs.w6.j(com.tencent.mm.modelavatar.d1.Ai().j(this.f70453d, false))) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = this.f70453d;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Long.valueOf(oVar.f70504a);
        objArr[2] = java.lang.Integer.valueOf(oVar.f70505b);
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarService", "checkAvatarUpdateExpire refresh username:%s, lastTime:%s, retryCount:%s", objArr);
        ((lt0.f) this.f70454e.f70523f).remove(this.f70453d);
        this.f70454e.i(this.f70453d);
    }

    public java.lang.String toString() {
        return super.toString() + "|checkAvatarUpdateExpire";
    }
}
