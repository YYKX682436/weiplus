package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class re implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ue f164440f;

    public re(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ue ueVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f164440f = ueVar;
        this.f164438d = e9Var;
        this.f164439e = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("ret", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ue ueVar = this.f164440f;
        int i18 = this.f164439e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164438d;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fileUrl", bundle.getString("fileUrl", ""));
            hashMap.put("thumbUrl", bundle.getString("thumbUrl", ""));
            e9Var.a(i18, ueVar.p("ok", hashMap));
            return;
        }
        if (i17 == 1) {
            e9Var.a(i18, ueVar.o("fail:cdn com upload error"));
            return;
        }
        if (i17 == 2) {
            e9Var.a(i18, ueVar.o("fail:cdn com call error"));
            return;
        }
        if (i17 == 3) {
            e9Var.a(i18, ueVar.o("fail:cancel succeed"));
            return;
        }
        if (i17 != 4) {
            e9Var.a(i18, ueVar.o("fail:cdn com upload error"));
            return;
        }
        e9Var.a(i18, ueVar.o("fail:cancel cdn com upload cancel: " + bundle.getLong("progress")));
    }
}
