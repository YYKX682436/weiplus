package com.p314xaae8f345.mm.p943x351df9c2;

/* loaded from: classes11.dex */
public class i implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p943x351df9c2.r f151987e;

    public i(com.p314xaae8f345.mm.p943x351df9c2.r rVar, java.lang.String str) {
        this.f151987e = rVar;
        this.f151986d = str;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AvatarService#checkAvatarUpdateExpire";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f151986d.equals(this.f151987e.f152058h)) {
            return;
        }
        com.p314xaae8f345.mm.p943x351df9c2.o oVar = (com.p314xaae8f345.mm.p943x351df9c2.o) ((lt0.f) this.f151987e.f152056f).i(this.f151986d);
        if (oVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - oVar.f152037a <= 21600 || com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().j(this.f151986d, false))) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = this.f151986d;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Long.valueOf(oVar.f152037a);
        objArr[2] = java.lang.Integer.valueOf(oVar.f152038b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarService", "checkAvatarUpdateExpire refresh username:%s, lastTime:%s, retryCount:%s", objArr);
        ((lt0.f) this.f151987e.f152056f).mo141381xc84af884(this.f151986d);
        this.f151987e.i(this.f151986d);
    }

    /* renamed from: toString */
    public java.lang.String m47935x9616526c() {
        return super.toString() + "|checkAvatarUpdateExpire";
    }
}
