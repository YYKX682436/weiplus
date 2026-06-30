package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class zg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f205962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb f205963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 f205964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb c5541xf0fa9cb, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2, java.lang.String str) {
        super(0);
        this.f205962d = componentCallbacksC1101xa17d4670;
        this.f205963e = c5541xf0fa9cb;
        this.f205964f = c14901x16d3f6f2;
        this.f205965g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.Object obj;
        r45.r03 r03Var;
        r45.r23 r23Var;
        r45.rz6 rz6Var;
        if (!this.f205962d.m7482xefa32bc()) {
            int i17 = this.f205963e.f135865g.f88775b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2 = this.f205964f;
            if (i17 == 1) {
                java.util.ArrayList m56388xcaeb60d0 = c14901x16d3f6f2.R6().m56388xcaeb60d0();
                java.util.Iterator it = m56388xcaeb60d0.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    str = this.f205965g;
                    obj = null;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    so2.j5 j5Var = (so2.j5) next;
                    so2.d5 d5Var = j5Var instanceof so2.d5 ? (so2.d5) j5Var : null;
                    if (d5Var != null && (r03Var = d5Var.f491847d) != null && (r23Var = (r45.r23) r03Var.m75936x14adae67(23)) != null && (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) != null) {
                        obj = rz6Var.f466853d;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, str)) {
                        obj = next;
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj;
                if (j5Var2 != null) {
                    long mo2128x1ed62e84 = j5Var2.mo2128x1ed62e84();
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c14901x16d3f6f2.f205001o;
                    if (c22848x6ddd90cf != null) {
                        c22848x6ddd90cf.e0(mo2128x1ed62e84);
                    }
                    m56388xcaeb60d0.removeIf(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.yg(mo2128x1ed62e84));
                    if (m56388xcaeb60d0.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2.P6(c14901x16d3f6f2);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ProfileTemplateUIC", "template unpublished, removed templateId=" + str);
                }
            } else if (i17 == 2) {
                c14901x16d3f6f2.f205007u = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
