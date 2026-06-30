package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166111a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f166112b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f166113c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f166114d;

    public e(java.lang.String appId, boolean z17, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 pkgWrappingInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgWrappingInfo, "pkgWrappingInfo");
        this.f166111a = appId;
        this.f166112b = z17;
        this.f166113c = z18;
        this.f166114d = pkgWrappingInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f
    public java.util.List a() {
        return this.f166114d.f156935g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f
    public java.lang.String b(java.lang.String fileEntryPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e c11656xaf63146e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileEntryPath, "fileEntryPath");
        java.util.LinkedList linkedList = this.f166114d.f156935g;
        if (linkedList == null || linkedList.isEmpty()) {
            c11656xaf63146e = this.f166114d;
        } else {
            java.util.LinkedList moduleList = this.f166114d.f156935g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moduleList, "moduleList");
            c11656xaf63146e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) ph1.i0.a(moduleList, fileEntryPath, "AheadRequestConfigStringReader", true);
            if (c11656xaf63146e == null) {
                c11656xaf63146e = this.f166114d;
            }
        }
        java.lang.String str = c11656xaf63146e != null ? c11656xaf63146e.f33455xe121c411 : null;
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8.l(str, fileEntryPath);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f
    public boolean c() {
        return this.f166113c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f
    /* renamed from: getAppId */
    public java.lang.String mo51710x74292566() {
        return this.f166111a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f
    public boolean k() {
        return this.f166112b;
    }
}
