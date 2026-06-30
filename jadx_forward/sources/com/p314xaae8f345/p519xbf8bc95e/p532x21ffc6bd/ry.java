package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ry implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f132835a = "yyyy/MM/dd HH时";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String[] f132836c = {"交通事故", "交通管制", "道路施工", "路上障碍物", "活动", "恶劣天气", "灾害", "拥堵", "检查", "一般事故", "积水", "其他事件"};

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String[] f132837d = {"发生", "出现", "有", "有", "有", "出现", "有", "出现", "有", "发生", "有", "有"};

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 f132838b;

    public ry(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 c4375x79cf0471) {
        this.f132838b = c4375x79cf0471;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471 a() {
        return this.f132838b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getDescription */
    public final java.lang.String mo36956x730bcac6() {
        int i17 = this.f132838b.f17305x592d42e.f17303x368f3a;
        java.lang.String str = i17 > f132836c.length ? f132837d[r1.length - 1] : f132837d[i17 - 1];
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(f132835a, java.util.Locale.US);
        return simpleDateFormat.format(new java.util.Date(this.f132838b.f17305x592d42e.f17301xa23bb48a * 1000)) + " - " + simpleDateFormat.format(new java.util.Date(this.f132838b.f17305x592d42e.f17292x66d9d3b1 * 1000)) + (char) 65292 + mo36959x59201b41() + str + mo36962xfb85f7b0();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getEndTime */
    public final int mo36957xde00a612() {
        return this.f132838b.f17305x592d42e.f17292x66d9d3b1;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getMessage */
    public final java.lang.String mo36958x76b83bd1() {
        return this.f132838b.f17305x592d42e.f17297x38eb0007;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getRoadName */
    public final java.lang.String mo36959x59201b41() {
        return this.f132838b.f17305x592d42e.f17299xdd5469ab;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getSource */
    public final java.lang.String mo36960x2fa78b11() {
        return this.f132838b.f17305x592d42e.f17300xca90681b;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getStartTime */
    public final int mo36961x8082fb99() {
        return this.f132838b.f17305x592d42e.f17301xa23bb48a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getType */
    public final java.lang.String mo36962xfb85f7b0() {
        int i17 = this.f132838b.f17305x592d42e.f17303x368f3a;
        java.lang.String[] strArr = f132836c;
        return i17 > strArr.length ? strArr[strArr.length - 1] : strArr[i17 - 1];
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd
    /* renamed from: getUpdateTime */
    public final int mo36963xdc9d2b2c() {
        return this.f132838b.f17305x592d42e.f17304xddd1e883;
    }
}
