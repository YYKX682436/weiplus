package yn2;

/* loaded from: classes2.dex */
public final class o {
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, boolean z17) {
        java.lang.String str;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 c0090x87990818;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a(item).m59135x7efe73ec());
        if (mb4Var != null) {
            str = ds2.h.f324399a.c(item.mo2128x1ed62e84(), mb4Var, false).n();
            float f17 = cu2.x.c(cu2.x.f303982a, str, false, false, false, 14, null).f68986xa6baeca6;
            if (f17 <= 0.0f) {
                r45.no2 m76812x1c39ba23 = item.getFeedObject().getFeedObject().m76812x1c39ba23();
                int m75939xb282bd08 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
                f17 = (m75939xb282bd08 <= 0 || mb4Var.m75939xb282bd08(3) <= 0) ? 0.0f : (m75939xb282bd08 * 1.0f) / mb4Var.m75939xb282bd08(3);
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 c0090x879908182 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (c0090x879908182 != null) {
                c0090x879908182.setProgress(a06.d.b(1000 * f17));
                c0090x879908182.setVisibility(f17 > 0.0f ? 0 : 8);
            }
        } else {
            if (z17 && (c0090x87990818 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0)) != null) {
                c0090x87990818.setProgress(0);
                c0090x87990818.setVisibility(8);
            }
            str = "";
        }
        java.lang.String str2 = str;
        boolean z19 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = false;
        }
        if (!z18 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z19 = false;
        }
        if (z19) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPlayProgress force=");
            sb6.append(z17);
            sb6.append(", cachePlayProgress=");
            sb6.append(cu2.x.c(cu2.x.f303982a, str2, false, false, false, 14, null).f68986xa6baeca6);
            sb6.append(",breakPointTimeMs=");
            r45.no2 m76812x1c39ba232 = item.getFeedObject().getFeedObject().m76812x1c39ba23();
            sb6.append(m76812x1c39ba232 != null ? java.lang.Integer.valueOf(m76812x1c39ba232.m75939xb282bd08(0)) : null);
            sb6.append(",videoDuration=");
            sb6.append(mb4Var != null ? java.lang.Integer.valueOf(mb4Var.m75939xb282bd08(3)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.SeeLaterCardConvert", sb6.toString());
        }
    }
}
