package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class k implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k f163420a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w1
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 appPauseType) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        u81.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appPauseType, "appPauseType");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE != appPauseType) {
            return true;
        }
        u81.b bVar = u81.b.FOREGROUND;
        u81.b bVar2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = lVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar : null;
        if (yVar != null && (t37 = yVar.t3()) != null && (hVar = t37.N) != null) {
            bVar2 = hVar.b();
        }
        return bVar != bVar2;
    }

    /* renamed from: toString */
    public java.lang.String m51081x9616526c() {
        return "AutoPauseIfNotNavigateStrategyLU";
    }
}
