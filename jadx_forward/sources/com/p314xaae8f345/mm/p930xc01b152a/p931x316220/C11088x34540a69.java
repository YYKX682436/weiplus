package com.p314xaae8f345.mm.p930xc01b152a.p931x316220;

/* renamed from: com.tencent.mm.mm7zip.impl.OutItemFactory */
/* loaded from: classes16.dex */
public class C11088x34540a69<T extends com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11051x42cfe9e9> {

    /* renamed from: ZERO */
    private static final java.lang.Long f32499x29f6a8 = 0L;

    /* renamed from: index */
    private int f32500x5fb28d2;

    /* renamed from: outArchive */
    private com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11039xe3d16abd<?> f32501xf7c89594;

    /* renamed from: com.tencent.mm.mm7zip.impl.OutItemFactory$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: $SwitchMap$com$tencent$mm$mm7zip$ArchiveFormat */
        static final /* synthetic */ int[] f32502x98735761;

        static {
            int[] iArr = new int[com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.m47548xcee59d22().length];
            f32502x98735761 = iArr;
            try {
                iArr[com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.SEVEN_ZIP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f32502x98735761[com.p314xaae8f345.mm.p930xc01b152a.EnumC11029xdd1ddb39.ZIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public C11088x34540a69(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11039xe3d16abd<?> interfaceC11039xe3d16abd, int i17) {
        this.f32501xf7c89594 = interfaceC11039xe3d16abd;
        this.f32500x5fb28d2 = i17;
    }

    /* renamed from: createOutItemIntern */
    private com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61 m47759xa3f90e57() {
        com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61 c11087x2138df61 = new com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61(this.f32501xf7c89594, this.f32500x5fb28d2);
        m47760x485e7200(c11087x2138df61);
        return c11087x2138df61;
    }

    /* renamed from: fillDefaultValues */
    private void m47760x485e7200(com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61 c11087x2138df61) {
        if (this.f32501xf7c89594.mo47629xbbdf30ca() != null) {
            c11087x2138df61.mo47623x625b4559(-1);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            c11087x2138df61.mo47621xae78a955(bool);
            c11087x2138df61.mo47622x92f21a9e(bool);
        }
        c11087x2138df61.mo47620xe134fd4d(f32499x29f6a8);
        c11087x2138df61.mo47611xe4c57436(new java.util.Date());
        int i17 = com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11088x34540a69.AnonymousClass1.f32502x98735761[c11087x2138df61.mo47613x6ade67a3().ordinal()];
        if (i17 == 1) {
            m47761xaa89f923(c11087x2138df61);
        } else {
            if (i17 == 2) {
                m47762xa6b5ad01(c11087x2138df61);
                return;
            }
            throw new java.lang.RuntimeException("No default values strategy for the archive format '" + c11087x2138df61.mo47613x6ade67a3() + "'");
        }
    }

    /* renamed from: fillDefaultValues7z */
    private void m47761xaa89f923(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11049x5f6fd41b interfaceC11049x5f6fd41b) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        interfaceC11049x5f6fd41b.mo47609x35572ae3(bool);
        interfaceC11049x5f6fd41b.mo47610x123ca8ec(bool);
        interfaceC11049x5f6fd41b.mo47608x72adc10e(0);
    }

    /* renamed from: fillDefaultValuesZip */
    private void m47762xa6b5ad01(com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11052x8e8b3109 interfaceC11052x8e8b3109) {
        interfaceC11052x8e8b3109.mo47610x123ca8ec(java.lang.Boolean.FALSE);
        interfaceC11052x8e8b3109.mo47608x72adc10e(0);
    }

    /* renamed from: createOutItem */
    public T m47763x43e76ae5() {
        return m47759xa3f90e57();
    }

    /* renamed from: createOutItemAndCloneProperties */
    public T m47765x7209835e(int i17) {
        com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11037xc9d7a994 mo47629xbbdf30ca = this.f32501xf7c89594.mo47629xbbdf30ca();
        if (mo47629xbbdf30ca == null) {
            throw new java.lang.RuntimeException("Not an update operation");
        }
        com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61 m47759xa3f90e57 = m47759xa3f90e57();
        m47759xa3f90e57.mo47623x625b4559(java.lang.Integer.valueOf(i17));
        m47759xa3f90e57.mo47621xae78a955(java.lang.Boolean.FALSE);
        m47759xa3f90e57.mo47622x92f21a9e(java.lang.Boolean.TRUE);
        m47759xa3f90e57.mo47612x63b2511c((java.lang.String) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.PATH));
        m47759xa3f90e57.mo47608x72adc10e((java.lang.Integer) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.ATTRIBUTES));
        m47759xa3f90e57.m47754x93521ae3((java.lang.Integer) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.POSIX_ATTRIB));
        m47759xa3f90e57.m47756x63b4d8c2((java.lang.String) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.USER));
        m47759xa3f90e57.m47752x1220a868((java.lang.String) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.GROUP));
        m47759xa3f90e57.mo47626x1961b443((java.util.Date) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.CREATION_TIME));
        m47759xa3f90e57.mo47611xe4c57436((java.util.Date) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.LAST_MODIFICATION_TIME));
        m47759xa3f90e57.mo47627x311439be((java.util.Date) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.LAST_ACCESS_TIME));
        m47759xa3f90e57.mo47609x35572ae3((java.lang.Boolean) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.IS_ANTI));
        m47759xa3f90e57.mo47610x123ca8ec((java.lang.Boolean) mo47629xbbdf30ca.mo47581x40a81b4b(i17, com.p314xaae8f345.mm.p930xc01b152a.EnumC11062x8efe4bde.IS_FOLDER));
        return m47759xa3f90e57;
    }

    /* renamed from: createOutItem */
    public T m47764x43e76ae5(int i17) {
        if (this.f32501xf7c89594.mo47629xbbdf30ca() != null) {
            com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11087x2138df61 m47759xa3f90e57 = m47759xa3f90e57();
            m47759xa3f90e57.mo47623x625b4559(java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m47759xa3f90e57.mo47621xae78a955(bool);
            m47759xa3f90e57.mo47622x92f21a9e(bool);
            return m47759xa3f90e57;
        }
        throw new java.lang.RuntimeException("Not an update operation");
    }
}
