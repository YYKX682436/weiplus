package bx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 f117769a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f117770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f117771c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35 f117772d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.SortedSet f117773e;

    /* renamed from: f, reason: collision with root package name */
    public final ex0.f f117774f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4178x3e32e554 f117775g;

    /* renamed from: h, reason: collision with root package name */
    public final int f117776h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f117777i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f117778j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f117779k;

    public c(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 timelineView, ex0.v storylineVM, ex0.f segmentVM, android.graphics.Rect originSegmentFrame, int i17, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35 timeOffsetMapper, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4178x3e32e554 segmentTimeOffsetMapper, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineView, "timelineView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storylineVM, "storylineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originSegmentFrame, "originSegmentFrame");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeOffsetMapper, "timeOffsetMapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentTimeOffsetMapper, "segmentTimeOffsetMapper");
        this.f117769a = timelineView;
        this.f117770b = originSegmentFrame;
        this.f117771c = i17;
        this.f117772d = timeOffsetMapper;
        java.util.TreeSet treeSet = new java.util.TreeSet(new bx0.a());
        kz5.z.u0(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a[0], treeSet);
        this.f117773e = treeSet;
        this.f117774f = segmentVM;
        this.f117775g = segmentTimeOffsetMapper;
        this.f117776h = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 5);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a m34346xcb0defcb = timeOffsetMapper.m34346xcb0defcb(segmentVM.l());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34346xcb0defcb, "pixelOffsetRangeForTimeRange(...)");
        this.f117777i = m34346xcb0defcb;
        java.util.Iterator it = ((java.util.ArrayList) storylineVM.f338710e).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 l17 = ((ex0.r) it.next()).l();
            ((java.util.TreeSet) this.f117773e).add(l17.m34009x8082fb99());
            ((java.util.TreeSet) this.f117773e).add(l17.m34007xde00a612());
        }
        if (list != null) {
            ((java.util.TreeSet) this.f117773e).addAll(list);
        }
        this.f117775g.m34359x74896fef(segmentTimeOffsetMapper.m34357xdd1fba(), segmentTimeOffsetMapper.m34356x19fc557a());
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a a(double d17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4177x7c871c35 c4177x7c871c35 = this.f117772d;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34349x5442ce5d = c4177x7c871c35.m34349x5442ce5d(d17);
        java.util.TreeSet treeSet = (java.util.TreeSet) this.f117773e;
        java.util.Iterator it = treeSet.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34349x5442ce5d);
            if (c4128x879fba0a.m33972x38a73ce5(m34349x5442ce5d) >= 0) {
                break;
            }
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj2;
        if (c4128x879fba0a2 == null) {
            c4128x879fba0a2 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        }
        for (java.lang.Object obj3 : treeSet) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a3 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj3;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m34349x5442ce5d);
            if (c4128x879fba0a3.m33972x38a73ce5(m34349x5442ce5d) <= 0) {
                obj = obj3;
            }
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a4 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) obj;
        if (c4128x879fba0a4 == null) {
            c4128x879fba0a4 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
        }
        if (!c4128x879fba0a2.m33983x7b953cf2() || !c4128x879fba0a4.m33983x7b953cf2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SegmentTrimContext", "find snap point. x = " + d17 + ", invalid time");
            this.f117778j = false;
            return c4128x879fba0a2;
        }
        double m34345x1629663d = c4177x7c871c35.m34345x1629663d(c4128x879fba0a2);
        double m34345x1629663d2 = c4177x7c871c35.m34345x1629663d(c4128x879fba0a4);
        double d18 = m34345x1629663d - d17;
        double d19 = d17 - m34345x1629663d2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try to find a snap point. range = [");
        sb6.append(m34345x1629663d2);
        sb6.append(", ");
        sb6.append(m34345x1629663d);
        sb6.append("], target = ");
        sb6.append(d17);
        sb6.append(", threshold = ");
        int i17 = this.f117776h;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SegmentTrimContext", sb6.toString());
        double d27 = i17;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.p915x577a0666.AbstractC11003x25486817 abstractC11003x25486817 = this.f117769a;
        if (d18 < d27) {
            if (this.f117778j) {
                return c4128x879fba0a2;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC11003x25486817, "<this>");
            abstractC11003x25486817.performHapticFeedback(0, 2);
            this.f117778j = true;
            return c4128x879fba0a2;
        }
        if (d19 >= d27) {
            this.f117778j = false;
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a5 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4128x879fba0a5);
            return c4128x879fba0a5;
        }
        if (!this.f117778j) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC11003x25486817, "<this>");
            abstractC11003x25486817.performHapticFeedback(0, 2);
            this.f117778j = true;
        }
        return c4128x879fba0a4;
    }
}
