package l53;

/* loaded from: classes8.dex */
public final class e implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l53.i f398177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f398178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f398182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398183g;

    public e(l53.i iVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap hashMap, java.lang.String str4) {
        this.f398177a = iVar;
        this.f398178b = activityC21401x6ce6f73f;
        this.f398179c = str;
        this.f398180d = str2;
        this.f398181e = str3;
        this.f398182f = hashMap;
        this.f398183g = str4;
    }

    @Override // k70.u
    public final void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.String str = this.f398181e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        l53.i iVar = this.f398177a;
        iVar.getClass();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
        java.lang.String str2 = this.f398179c;
        c11300x89dbd7a1.f33249xa1713a8c = str2;
        c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
        java.util.HashMap hashMap = this.f398182f;
        java.lang.String str3 = (java.lang.String) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (str3 == null) {
            str3 = "";
        }
        c11286x34a5504.f33130x6942258 = str3;
        c11286x34a5504.f33121x993583fc = (java.lang.String) hashMap.get("desc");
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(this.f398180d);
        if (Bi != null && !Bi.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str4 = iVar.f398193a.f404836a;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str4);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88614b = "wx62d9035fd4fd2059";
        jtVar.f88615c = h17 != null ? h17.f67372x453d1e07 : "";
        jtVar.f88616d = str;
        jtVar.f88617e = 2;
        jtVar.f88620h = null;
        jtVar.f88621i = str2;
        jtVar.f88622j = str2;
        c5987xfe669c12.e();
        java.lang.String str5 = this.f398183g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
            am.mt mtVar = c5990xd50ae361.f136285g;
            mtVar.f88895a = str;
            mtVar.f88896b = str5;
            mtVar.f88897c = c01.e2.C(str);
            mtVar.f88898d = 0;
            c5990xd50ae361.e();
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f398178b;
        db5.e1.T(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        l53.a aVar = iVar.f398195c;
        if (aVar != null) {
            aVar.mo64832xe05b4124();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToFriend success");
    }
}
