package com.p314xaae8f345.p3121x37984a.orm;

/* renamed from: com.tencent.wcdb.orm.Field */
/* loaded from: classes12.dex */
public class C26981x40bb0da<T> extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f58372x7118e671 = false;

    /* renamed from: binding */
    protected com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> f58373xf98cae85;

    /* renamed from: fieldId */
    private int f58374xccaa53b5;

    /* renamed from: isAutoIncrement */
    private boolean f58375xf0271976;

    /* renamed from: isPrimaryKey */
    private boolean f58376x356d3dc7;

    /* renamed from: name */
    private java.lang.String f58377x337a8b;

    public C26981x40bb0da(java.lang.String str, com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> interfaceC26982x5a8a1af7, int i17, boolean z17, boolean z18) {
        super(str, interfaceC26982x5a8a1af7.mo107913x82ba2274().m107901x5c90693e());
        this.f58377x337a8b = str;
        this.f58373xf98cae85 = interfaceC26982x5a8a1af7;
        this.f58374xccaa53b5 = i17;
        this.f58375xf0271976 = z17;
        this.f58376x356d3dc7 = z18;
    }

    @java.lang.SafeVarargs
    /* renamed from: getBindClass */
    public static <T> java.lang.Class<T> m107902xc6702485(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>... c26981x40bb0daArr) {
        return c26981x40bb0daArr[0].f58373xf98cae85.mo107915xeeffe75f();
    }

    /* renamed from: getBinding */
    public static <T> com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107903x3759ea4f(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da) {
        return c26981x40bb0da.m107908xb1b1594d();
    }

    /* renamed from: copySelf */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> m107905xe1d73061() {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da = new com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<>();
        c26981x40bb0da.f57826xaf4e2c54 = m108065x2eaf75(this.f57826xaf4e2c54);
        c26981x40bb0da.f58377x337a8b = this.f58377x337a8b;
        c26981x40bb0da.f58374xccaa53b5 = this.f58374xccaa53b5;
        c26981x40bb0da.f58375xf0271976 = this.f58375xf0271976;
        c26981x40bb0da.f58376x356d3dc7 = this.f58376x356d3dc7;
        c26981x40bb0da.f58373xf98cae85 = this.f58373xf98cae85;
        return c26981x40bb0da;
    }

    /* renamed from: getFieldId */
    public int m107906xa778f7f() {
        return this.f58374xccaa53b5;
    }

    /* renamed from: getName */
    public java.lang.String m107907xfb82e301() {
        return this.f58377x337a8b;
    }

    /* renamed from: getTableBinding */
    public com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107908xb1b1594d() {
        return this.f58373xf98cae85;
    }

    /* renamed from: isAutoIncrement */
    public boolean m107909xf0271976() {
        return this.f58375xf0271976;
    }

    /* renamed from: isPrimaryKey */
    public boolean m107910x356d3dc7() {
        return this.f58376x356d3dc7;
    }

    @java.lang.SafeVarargs
    /* renamed from: getBinding */
    public static <T> com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107904x3759ea4f(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>... c26981x40bb0daArr) {
        return m107903x3759ea4f(c26981x40bb0daArr[0]);
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76
    /* renamed from: table */
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> mo107911x6903bce(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> m107905xe1d73061 = m107905xe1d73061();
        m107905xe1d73061.m108066x72f0ada9(m107905xe1d73061.f57826xaf4e2c54, str);
        return m107905xe1d73061;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> of(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> m107905xe1d73061 = m107905xe1d73061();
        m107905xe1d73061.m108069xb1a43258(str);
        return m107905xe1d73061;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76
    public com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> of(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27023x934621c1 c27023x934621c1) {
        com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> m107905xe1d73061 = m107905xe1d73061();
        m107905xe1d73061.m108068xb1a43258(c27023x934621c1);
        return m107905xe1d73061;
    }

    public C26981x40bb0da() {
        this.f58373xf98cae85 = null;
        this.f58374xccaa53b5 = 0;
        this.f58375xf0271976 = false;
        this.f58376x356d3dc7 = false;
    }
}
