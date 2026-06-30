package ex0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 f338706a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f338707b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f338708c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.WeakHashMap f338709d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f338710e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f338711f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f338712g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f338713h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f338714i;

    public v(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 storyline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyline, "storyline");
        this.f338706a = storyline;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a ZeroTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ZeroTime, "ZeroTime");
        this.f338707b = ZeroTime;
        this.f338708c = new p012xc85e97e9.p093xedfae76a.j0();
        this.f338709d = new java.util.WeakHashMap();
        this.f338710e = new java.util.ArrayList();
        this.f338711f = new java.util.ArrayList();
        this.f338712g = new java.util.ArrayList();
        this.f338713h = new java.util.ArrayList();
        this.f338714i = new java.util.ArrayList();
        h();
    }

    public final ex0.r a(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
        switch (segment.C()) {
            case None:
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return null;
            case Transition:
                return new ex0.j0((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4192xbfe54ffe) segment);
            case MovieClip:
                return new ex0.j((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) segment);
            case VideoClip:
            default:
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                return null;
            case ImageClip:
                return new ex0.i((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) segment);
            case MovieTitle:
                return new ex0.l((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb) segment);
            case ContentDesc:
                return new ex0.d((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49) segment);
            case FancyText:
                return new ex0.k((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4185x4df31add) segment);
            case WhenWhere:
                return new ex0.k0((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6) segment);
            case Emoticon:
                return new ex0.g((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4184x9a5fedad) segment);
            case Music:
                return new ex0.o((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4188xeef5596e) segment);
            case Narration:
                return new ex0.q((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4189xeb0c3951) segment);
            case Caption:
                return new ex0.b((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4180x49749a8d) segment);
        }
    }

    public final boolean b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        return this.f338709d.get(c3971x241f78) != null;
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c() {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a = this.f338706a.n().m34005x51e8b0a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34005x51e8b0a, "getPresentationDuration(...)");
        return m34005x51e8b0a;
    }

    public final boolean d(ex0.r segmentVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        return ((java.util.ArrayList) this.f338711f).contains(segmentVM) && !e(segmentVM);
    }

    public final boolean e(ex0.r segmentVM) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        return this.f338710e.contains(segmentVM);
    }

    public final ex0.r f(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        double d17 = Double.MAX_VALUE;
        ex0.r rVar = null;
        for (ex0.r rVar2 : this.f338710e) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = rVar2.f338700a;
            c4190xd8dd3713.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4190xd8dd3713.D();
            if (D != null) {
                bool = java.lang.Boolean.valueOf(c4190xd8dd3713.m34634xe5fd362(D, c4190xd8dd3713.f130065a.m32425x6ac9171()));
            }
            if (bool.booleanValue()) {
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 l17 = rVar2.l();
                if (l17.m34002x805f158c(time)) {
                    return rVar2;
                }
                double abs = java.lang.Math.abs(l17.m34009x8082fb99().sub(time).m33988x124aa384());
                if (abs < d17) {
                    rVar = rVar2;
                    d17 = abs;
                }
                double abs2 = java.lang.Math.abs(l17.m34007xde00a612().sub(time).m33988x124aa384());
                if (abs2 < d17) {
                    rVar = rVar2;
                    d17 = abs2;
                }
            }
        }
        return rVar;
    }

    public final ex0.r g(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        if (c3971x241f78 == null) {
            return null;
        }
        return (ex0.r) this.f338709d.get(c3971x241f78);
    }

    public final void h() {
        ex0.r a17;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f338711f;
        arrayList.clear();
        ((java.util.ArrayList) this.f338710e).clear();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f338712g;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f338714i;
        arrayList3.clear();
        java.util.ArrayList arrayList4 = (java.util.ArrayList) this.f338713h;
        arrayList4.clear();
        java.util.WeakHashMap weakHashMap = this.f338709d;
        weakHashMap.clear();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649 = this.f338706a;
        int p17 = c4160xdd704649.p();
        for (int i17 = 0; i17 < p17; i17++) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 o17 = c4160xdd704649.o(i17);
            if (o17 != null && (a17 = a(o17)) != null) {
                arrayList.add(a17);
                weakHashMap.put(a17.f338701b, a17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StorylineViewModel", "AllSegmentVMs: " + arrayList);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.r) obj).f338700a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861) c4160xdd704649.f129936a.get();
            if (c4167x88133861 != null) {
                bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649.a(c4160xdd704649, c4190xd8dd3713, c4167x88133861);
            }
            if (bool.booleanValue()) {
                arrayList5.add(obj);
            }
        }
        java.util.List F0 = kz5.n0.F0(arrayList5, ex0.s.f338705d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StorylineViewModel", "StorySegmentVMs before sort: " + arrayList5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StorylineViewModel", "StorySegmentVMs after sort: " + F0);
        ((java.util.ArrayList) this.f338710e).addAll(F0);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((ex0.r) next).f338702c == ug.m.Narration) {
                arrayList6.add(next);
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList6.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            ex0.r rVar = (ex0.r) it6.next();
            ex0.q qVar = rVar instanceof ex0.q ? (ex0.q) rVar : null;
            if (qVar != null) {
                arrayList7.add(qVar);
            }
        }
        arrayList2.addAll(arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((ex0.r) obj2).f338702c == ug.m.Transition) {
                arrayList8.add(obj2);
            }
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList8.iterator();
        while (it7.hasNext()) {
            ex0.r rVar2 = (ex0.r) it7.next();
            ex0.j0 j0Var = rVar2 instanceof ex0.j0 ? (ex0.j0) rVar2 : null;
            if (j0Var != null) {
                arrayList9.add(j0Var);
            }
        }
        arrayList3.addAll(arrayList9);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (((ex0.r) obj3).f338702c == ug.m.Caption) {
                arrayList10.add(obj3);
            }
        }
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        java.util.Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            ex0.r rVar3 = (ex0.r) it8.next();
            ex0.b bVar = rVar3 instanceof ex0.b ? (ex0.b) rVar3 : null;
            if (bVar != null) {
                arrayList11.add(bVar);
            }
        }
        arrayList4.addAll(arrayList11);
    }

    public final void i(boolean z17) {
        if (z17) {
            this.f338707b = c();
            return;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c17 = c();
        if (this.f338707b.m33975x22a7969a(c17)) {
            return;
        }
        this.f338708c.mo7808x76db6cb1(c17);
        this.f338707b = c();
    }

    /* renamed from: toString */
    public java.lang.String m128277x9616526c() {
        return this.f338706a.toString();
    }
}
