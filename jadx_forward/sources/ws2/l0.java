package ws2;

/* loaded from: classes3.dex */
public final class l0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f530621d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f530622e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f530623f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f530624g;

    public l0(java.lang.ref.WeakReference rHelper, java.lang.String tag, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rHelper, "rHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f530621d = rHelper;
        this.f530622e = tag;
        this.f530623f = z17;
        this.f530624g = z18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.i72 i72Var;
        int m75939xb282bd08;
        r45.i72 i72Var2;
        r45.i72 i72Var3;
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFinderObject(forRestar:");
        boolean z17 = this.f530623f;
        sb6.append(z17);
        sb6.append(") result ");
        sb6.append(result.f152148a);
        sb6.append(' ');
        sb6.append(result.f152149b);
        sb6.append(",playTransition:");
        boolean z18 = this.f530624g;
        sb6.append(z18);
        sb6.append('!');
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(sb6.toString());
        int i17 = result.f152148a;
        java.lang.ref.WeakReference weakReference = this.f530621d;
        if (i17 == 0 && result.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) result.f152151d).m75936x14adae67(2);
            if (c19792x256d2725 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("newFeed ");
                sb7.append(c19792x256d2725.m76801x8010e5e4());
                sb7.append(" id:");
                sb7.append(c19792x256d2725.m76784x5db1b11());
                sb7.append(",replay info:[");
                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                sb7.append((m76794xd0557130 == null || (i72Var3 = (r45.i72) m76794xd0557130.m75936x14adae67(44)) == null) ? null : java.lang.Integer.valueOf(i72Var3.m75939xb282bd08(0)));
                sb7.append(',');
                r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                sb7.append((m76794xd05571302 == null || (i72Var2 = (r45.i72) m76794xd05571302.m75936x14adae67(44)) == null) ? null : java.lang.Long.valueOf(i72Var2.m75942xfb822ef2(1)));
                sb7.append(']');
                stringBuffer.append(sb7.toString());
                java.lang.String stringBuffer2 = stringBuffer.toString();
                java.lang.String str = this.f530622e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, stringBuffer2);
                ws2.p0 p0Var = (ws2.p0) weakReference.get();
                if (p0Var != null) {
                    mm2.e1 e1Var = (mm2.e1) p0Var.b(mm2.e1.class);
                    if (e1Var != null && c19792x256d2725.m76784x5db1b11() == e1Var.f410516m) {
                        km2.m m57663xfb7e5820 = p0Var.f530650a.m57663xfb7e5820();
                        if (m57663xfb7e5820 != null) {
                            m57663xfb7e5820.f390662d = zl2.l.c(zl2.l.f555398a, c19792x256d2725, 0, false, 6, null);
                            cm2.a.f124861a.v(m57663xfb7e5820, c19792x256d2725, 2);
                            r45.nw1 m76794xd05571303 = c19792x256d2725.m76794xd0557130();
                            if (m76794xd05571303 != null && (i72Var = (r45.i72) m76794xd05571303.m75936x14adae67(44)) != null && (m75939xb282bd08 = i72Var.m75939xb282bd08(2)) > 0) {
                                ((ct2.j) m57663xfb7e5820.f390663e.a(ct2.j.class)).a7(m75939xb282bd08, java.lang.Boolean.TRUE);
                            }
                        }
                        ws2.p0.a(p0Var, z17, z18);
                    } else {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("resp id different with local objectId:");
                        mm2.e1 e1Var2 = (mm2.e1) p0Var.b(mm2.e1.class);
                        sb8.append(e1Var2 != null ? java.lang.Long.valueOf(e1Var2.f410516m) : null);
                        sb8.append('!');
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb8.toString());
                    }
                }
            }
        } else {
            ws2.p0 p0Var2 = (ws2.p0) weakReference.get();
            if (p0Var2 != null) {
                ws2.p0.a(p0Var2, z17, z18);
            }
        }
        return jz5.f0.f384359a;
    }
}
