package com.p314xaae8f345.mm.udr;

/* loaded from: classes5.dex */
public final class r0 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f278040b;

    public r0(java.lang.String str, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f278039a = str;
        this.f278040b = rVar;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String projectId, java.lang.String name, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", this.f278039a + " onCallBackFailAsync projectId:" + projectId + ", name:" + name);
        super.mo13581xd73276fa(j17, i17, i18, projectId, name, i19, type);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("state", "fail");
        bundle.putString("projectId", projectId);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name);
        bundle.putInt("errNo", i17);
        bundle.putInt("errCode", i18);
        bundle.putInt("version", i19);
        bundle.putLong("taskId", j17);
        bundle.putInt("type", type.f299091d);
        this.f278040b.a(bundle);
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String projectId, java.lang.String name, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectId, "projectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", this.f278039a + " onCallBackSuccessAsync projectId:" + projectId + ", name:" + name);
        super.mo13582x5e6271bd(j17, projectId, name, i17, type);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("state", ya.b.f77504xbb80cbe3);
        bundle.putString("projectId", projectId);
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name);
        bundle.putInt("version", i17);
        bundle.putLong("taskId", j17);
        bundle.putInt("type", type.f299091d);
        this.f278040b.a(bundle);
    }
}
