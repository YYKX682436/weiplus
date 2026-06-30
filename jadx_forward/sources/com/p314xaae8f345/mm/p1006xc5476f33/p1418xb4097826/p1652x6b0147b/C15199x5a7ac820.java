package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoViewForTopic;", "Lcom/tencent/mm/plugin/finder/video/FinderVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic */
/* loaded from: classes4.dex */
public final class C15199x5a7ac820 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a {

    /* renamed from: e2, reason: collision with root package name */
    public int f212268e2;

    public C15199x5a7ac820(android.content.Context context) {
        super(context);
        this.f212268e2 = 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15198x17d381a, com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean Z(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f start, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f end) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        start.f38864x6ac9171 = java.lang.Math.max(i17, this.E1);
        int i18 = this.f153184y1;
        if (i18 == 1) {
            start.f38864x6ac9171 = i17;
            end.f38864x6ac9171 = this.f212268e2 + i17 + 1;
        }
        int i19 = this.f212268e2;
        t21.n0 n0Var = this.J1;
        this.f212268e2 = i19 + n0Var.f496373a;
        if (i18 == 2) {
            int i27 = i17 - 8;
            start.f38864x6ac9171 = i27;
            if (i27 < 0) {
                start.f38864x6ac9171 = 0;
            }
            end.f38864x6ac9171 = start.f38864x6ac9171 + this.F1 + 8;
        }
        if (i18 == 3 || i18 == 4) {
            start.f38864x6ac9171 = this.E1;
            int i28 = n0Var.f496374b;
            end.f38864x6ac9171 = this.A1 + 1;
        }
        int i29 = end.f38864x6ac9171;
        int i37 = this.A1;
        if (i29 >= i37 + 1) {
            end.f38864x6ac9171 = i37 + 1;
        }
        int i38 = end.f38864x6ac9171;
        int i39 = start.f38864x6ac9171;
        if (i38 < i39) {
            end.f38864x6ac9171 = i39 + n0Var.f496374b;
            mo48238x68ac462();
        }
        return true;
    }

    public C15199x5a7ac820(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212268e2 = 3;
    }
}
