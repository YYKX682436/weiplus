package te2;

/* loaded from: classes3.dex */
public final class u1 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xg7 f499995d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 f499996e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f499997f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f499998g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u1(android.content.Context r1, android.util.AttributeSet r2, int r3, sf2.e0 r4, r45.xg7 r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r0 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r7 = r6 & 4
            if (r7 == 0) goto La
            r3 = 0
        La:
            r6 = r6 & 16
            if (r6 == 0) goto L10
            r45.xg7 r5 = r45.xg7.emFinderLiveGetMusicTabListType_Recommend
        L10:
            java.lang.String r6 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r6)
            java.lang.String r6 = "controller"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r6)
            java.lang.String r6 = "type"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r6)
            r0.<init>(r1, r2, r3)
            r0.f499995d = r5
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r1)
            r3 = 2131495310(0x7f0c098e, float:1.8614153E38)
            r6 = 1
            r2.inflate(r3, r0, r6)
            com.tencent.mm.plugin.finder.live.widget.r7 r2 = new com.tencent.mm.plugin.finder.live.widget.r7
            r3 = 2131306934(0x7f0929b6, float:1.8232081E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r6 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r6)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            te2.s1 r6 = te2.s1.f499929d
            r2.<init>(r3, r4, r5, r6)
            r0.f499996e = r2
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = r2.f201117e
            r0.f499997f = r3
            java.util.Map r6 = r4.f488646o
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r5 = r6.get(r5)
            bm2.a0 r5 = (bm2.a0) r5
            r3.mo7960x6cab2c8d(r5)
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            r5.<init>(r1)
            r3.mo7967x900dcbe1(r5)
            te2.t1 r1 = new te2.t1
            r1.<init>(r0, r4)
            ym5.a1.g(r3, r1)
            android.widget.TextView r1 = r2.f201118f
            r0.f499998g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.u1.<init>(android.content.Context, android.util.AttributeSet, int, sf2.e0, r45.xg7, int, kotlin.jvm.internal.i):void");
    }

    /* renamed from: getMusicRv */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m166328x92013f13() {
        return this.f499997f;
    }

    /* renamed from: getMusicRvWidget */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r7 m166329x7d58ab37() {
        return this.f499996e;
    }

    /* renamed from: getTvNoMusic */
    public final android.widget.TextView m166330xf03e654c() {
        return this.f499998g;
    }

    /* renamed from: getType */
    public final r45.xg7 m166331xfb85f7b0() {
        return this.f499995d;
    }
}
