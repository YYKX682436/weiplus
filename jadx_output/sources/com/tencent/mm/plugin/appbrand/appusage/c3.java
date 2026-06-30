package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class c3 extends dm.a0 {
    public static final l75.e0 B = dm.a0.initAutoDBInfo(dm.a0.class);

    @Override // dm.a0, l75.f0
    public android.content.ContentValues convertTo() {
        this.systemRowid = 0L;
        android.content.ContentValues convertTo = super.convertTo();
        int u07 = com.tencent.mm.plugin.appbrand.appusage.f3.u0(this.field_brandId, this.field_versionType, this.field_scene);
        this.field_recordId = u07;
        convertTo.put("recordId", java.lang.Integer.valueOf(u07));
        return convertTo;
    }

    @Override // dm.a0, l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }
}
