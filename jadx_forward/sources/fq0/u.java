package fq0;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fq0.x f347003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f347004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, java.lang.String str2, fq0.x xVar, yz5.p pVar) {
        super(0);
        this.f347001d = str;
        this.f347002e = str2;
        this.f347003f = xVar;
        this.f347004g = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setGestureRects viewId:");
        java.lang.String viewId = this.f347001d;
        sb6.append(viewId);
        sb6.append(", rects:");
        java.lang.String rects = this.f347002e;
        sb6.append(rects);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", sb6.toString());
        hq0.e0 e0Var = this.f347003f.f347012c;
        if (e0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rects, "rects");
            yz5.p callback = this.f347004g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            hq0.f fVar = e0Var.f364521i.f364535q;
            if (fVar != null) {
                dq0.a0 a0Var = (dq0.a0) fVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = new java.util.ArrayList();
                try {
                    c75.c.d(new org.json.JSONArray(rects), new dq0.y(h0Var));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "rects: " + rects + ", e: " + e17);
                }
                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v.f149627h.mo20599xaaa148a0();
                mo20599xaaa148a0.f149623d |= 1;
                mo20599xaaa148a0.f149624e = viewId;
                mo20599xaaa148a0.m20881x7bb163d5();
                java.lang.Iterable iterable = (java.lang.Iterable) h0Var.f391656d;
                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = mo20599xaaa148a0.f149626g;
                if (p9Var == null) {
                    if ((mo20599xaaa148a0.f149623d & 2) == 0) {
                        mo20599xaaa148a0.f149625f = new java.util.ArrayList(mo20599xaaa148a0.f149625f);
                        mo20599xaaa148a0.f149623d |= 2;
                    }
                    com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940(iterable, mo20599xaaa148a0.f149625f);
                    mo20599xaaa148a0.m20881x7bb163d5();
                } else {
                    p9Var.b(iterable);
                }
                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v mo20557x85702333 = mo20599xaaa148a0.mo20557x85702333();
                if (!mo20557x85702333.mo20562xf582434a()) {
                    throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
                }
                a0Var.n("setGestureRects", mo20557x85702333.mo20648x5f01b1f6(), new dq0.z(callback));
            }
        }
        return jz5.f0.f384359a;
    }
}
