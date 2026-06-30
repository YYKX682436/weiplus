package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes13.dex */
public enum r {
    MMNEWTIPS_SHOWTYPE_NONE("无红点", 10000),
    MMNEWTIPS_SHOWTYPE_REDPOINT("普通红点", 0),
    MMNEWTIPS_SHOWTYPE_NEW("New 红点", 1),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE("带 TITLE 红点", 2),
    MMNEWTIPS_SHOWTYPE_REDPOINT_ICON("带 ICON 红点", 3),
    MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON("同时带 TITLE 和 ICON 红点", 4),
    MMNEWTIPS_SHOWTYPE_COUNTER("计数红点", 5);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233928d;

    /* renamed from: e, reason: collision with root package name */
    public final int f233929e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f233930f = null;

    r(java.lang.String str, int i17) {
        this.f233928d = str;
        this.f233929e = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar = MMNEWTIPS_SHOWTYPE_REDPOINT;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 10000 ? rVar : MMNEWTIPS_SHOWTYPE_NONE : MMNEWTIPS_SHOWTYPE_COUNTER : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_ICON : MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE : MMNEWTIPS_SHOWTYPE_NEW : rVar;
    }

    public static r45.pm6 b(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, dm.j8 j8Var) {
        r45.pm6 pm6Var = new r45.pm6();
        int ordinal = rVar.ordinal();
        if (ordinal == 3) {
            pm6Var.f464720e = j8Var.f67150x29dd02d3;
        } else if (ordinal == 4) {
            pm6Var.f464721f = j8Var.f67137xf1cc564e;
        } else if (ordinal == 5) {
            pm6Var.f464721f = j8Var.f67137xf1cc564e;
            pm6Var.f464720e = j8Var.f67150x29dd02d3;
        }
        pm6Var.f464732t = j8Var.f67136x26b3182a;
        pm6Var.f464735w = j8Var.f67146x991217c;
        pm6Var.f464733u = j8Var.f67148x29dcef91;
        pm6Var.f464734v = j8Var.f67151xc35ee71;
        return pm6Var;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return "NewTipsShowType{commet='" + this.f233928d + "', value=" + this.f233929e + '}';
    }
}
