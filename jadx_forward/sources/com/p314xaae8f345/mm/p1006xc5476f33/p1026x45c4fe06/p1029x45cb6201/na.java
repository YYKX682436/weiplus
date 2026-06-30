package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class na implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa f157224f;

    public na(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa qaVar, java.util.List list, java.util.List list2) {
        this.f157224f = qaVar;
        this.f157222d = list;
        this.f157223e = list2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f157222d;
            if (i17 >= list.size()) {
                return java.lang.Boolean.TRUE;
            }
            this.f157224f.e((java.lang.String) list.get(i17), ((java.lang.Integer) this.f157223e.get(i17)).intValue());
            i17++;
        }
    }
}
