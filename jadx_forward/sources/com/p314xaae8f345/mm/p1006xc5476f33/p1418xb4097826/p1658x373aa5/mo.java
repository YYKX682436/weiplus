package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class mo implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wb
    public boolean a(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 comment, android.widget.TextView tagView, android.widget.ImageView iconView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagView, "tagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconView, "iconView");
        r45.k60 m76073x14544c = comment.m76073x14544c();
        java.util.LinkedList m75941xfb821914 = m76073x14544c != null ? m76073x14544c.m75941xfb821914(0) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            return false;
        }
        r45.h60 h60Var = (r45.h60) kz5.n0.k0(m75941xfb821914);
        java.lang.String m75945x2fec8307 = h60Var != null ? h60Var.m75945x2fec8307(0) : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m75945x2fec8307, true);
        i95.m c17 = i95.n0.c(tg3.v0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String f17 = c01.a2.f(m75945x2fec8307, n17.P0());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        sb6.append(hc2.x0.f(f17, 6));
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        android.content.Context context = tagView.getContext();
        iconView.setVisibility(8);
        tagView.setVisibility(0);
        tagView.setTextColor(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        int textSize = (int) tagView.getTextSize();
        java.lang.String string = m75941xfb821914.size() == 1 ? tagView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1r) : tagView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573570f10, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(m75941xfb821914.size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        tagView.setText(new android.text.SpannableStringBuilder().append((java.lang.CharSequence) sb7).append(hc2.x0.k(string, context, '#', com.p314xaae8f345.mm.R.raw.f80143xebd704ef, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19, textSize, textSize, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null)));
        return true;
    }
}
