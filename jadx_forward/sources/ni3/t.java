package ni3;

/* loaded from: classes10.dex */
public final class t extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419268d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419268d = c16559xedc507d9;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = this.f419268d.f230992h;
        if (c13920xa5f564aa != null) {
            return c13920xa5f564aa.m56384xdd045eaf();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        throw null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = this.f419268d.f230992h;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            throw null;
        }
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(c13920xa5f564aa, i17);
        if (j5Var != null) {
            return j5Var.mo2128x1ed62e84();
        }
        return 0L;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18;
        java.lang.CharSequence charSequence;
        int i19;
        int i27;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        long j18;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9;
        so2.j5 j5Var;
        long j19;
        ni3.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d92;
        java.lang.String sb6;
        android.widget.TextView textView;
        java.lang.CharSequence charSequence2;
        int i28;
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d93;
        int i29;
        boolean z17;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String concat;
        ni3.r rVar;
        java.lang.String str8;
        java.lang.String concat2;
        ni3.r rVar2;
        java.lang.String str9;
        ni3.r rVar3;
        ni3.r rVar4;
        r45.vf2 vf2Var;
        r45.vf2 vf2Var2;
        ni3.u holder = (ni3.u) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d94 = this.f419268d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = c16559xedc507d94.f230992h;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            throw null;
        }
        so2.j5 j5Var2 = (so2.j5) kz5.n0.a0(c13920xa5f564aa, i17);
        android.widget.TextView textView2 = holder.f419275d;
        if (j5Var2 == null) {
            textView2.setText(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
            return;
        }
        java.lang.String u17 = pm0.v.u(j5Var2.mo2128x1ed62e84());
        java.lang.String obj = u17.subSequence(java.lang.Math.max(0, u17.length() - 4), u17.length()).toString();
        r45.mb4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9.c(c16559xedc507d94, j5Var2);
        java.lang.String m75945x2fec8307 = c17.m75945x2fec8307(9);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            textView2.setText("unknown feedType(" + j5Var2.h() + ')');
            return;
        }
        textView2.setOnLongClickListener(new ni3.s(holder, c16559xedc507d94));
        java.lang.String m75945x2fec83072 = c17.m75945x2fec8307(9);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        ni3.q qVar2 = (ni3.q) c16559xedc507d94.f230999r.get(m75945x2fec83072);
        if (c16559xedc507d94.f230991g) {
            j5Var2.mo2128x1ed62e84();
            java.lang.String m75945x2fec83073 = c17.m75945x2fec8307(9);
            if (m75945x2fec83073 != null) {
                java.lang.String m75945x2fec83074 = c17.m75945x2fec8307(9);
                int length = m75945x2fec83074 != null ? m75945x2fec83074.length() : 0;
                charSequence2 = m75945x2fec83073.subSequence(0, 5 > length ? length : 5);
            } else {
                charSequence2 = null;
            }
            java.lang.String valueOf = java.lang.String.valueOf(charSequence2);
            int m75939xb282bd08 = c17.m75939xb282bd08(2);
            int i37 = qVar2 != null ? qVar2.f419220b : 0;
            if (qVar2 != null) {
                i28 = qVar2.f419221c;
                if (i28 == 0) {
                    i28 = qVar2.f419220b;
                }
            } else {
                i28 = 0;
            }
            java.lang.Math.max(i37, i28);
            java.lang.String str10 = qVar2 != null ? qVar2.f419223e : null;
            long mo2128x1ed62e84 = j5Var2.mo2128x1ed62e84();
            java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9.b(c16559xedc507d94, j5Var2);
            if (j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59314x4d5c4d55();
                c16559xedc507d93 = c16559xedc507d94;
                i29 = 3;
            } else {
                c16559xedc507d93 = c16559xedc507d94;
                i29 = 3;
                z17 = false;
            }
            int m75939xb282bd082 = c17.m75939xb282bd08(i29);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            if (mo2128x1ed62e84 != 0) {
                sb7.append("> ");
            }
            if (z17) {
                sb7.append(i17 + "-[长视频-#" + obj + "] ");
            } else if (m75939xb282bd08 == 4) {
                sb7.append(i17 + "-[视频-#" + obj + "] ");
            } else if (m75939xb282bd08 == 2) {
                sb7.append(i17 + "-[图片-#" + obj + "] ");
                if (qVar2 != null) {
                    qVar2.f419227i = ni3.r.f419237e;
                }
                if (qVar2 != null) {
                    qVar2.f419228j = ni3.r.f419243n;
                }
            } else if (m75939xb282bd08 == 9) {
                sb7.append(i17 + "-[直播-#" + obj + "] ");
                if (qVar2 != null) {
                    qVar2.f419227i = ni3.r.f419237e;
                }
                if (qVar2 != null) {
                    qVar2.f419228j = ni3.r.f419243n;
                }
            } else {
                sb7.append("[?-" + i17 + '#' + obj + "] ");
            }
            sb7.append(valueOf.concat(" "));
            if (str10 != null) {
                sb7.append(str10);
            }
            yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            jz5.o oVar = (jz5.o) ek6.f546234r.get(qVar2 != null ? qVar2.f419233o : null);
            int longValue = oVar != null ? (int) ((java.lang.Number) oVar.f384376f).longValue() : 0;
            java.lang.String str11 = qVar2 != null ? qVar2.f419233o : null;
            kk.l lVar = ek6.f546234r;
            jz5.o oVar2 = (jz5.o) lVar.get(str11);
            int m75939xb282bd083 = (oVar2 == null || (vf2Var2 = (r45.vf2) oVar2.f384374d) == null) ? 0 : vf2Var2.m75939xb282bd08(2);
            jz5.o oVar3 = (jz5.o) lVar.get(qVar2 != null ? qVar2.f419233o : null);
            if (oVar3 != null && (vf2Var = (r45.vf2) oVar3.f384374d) != null) {
                vf2Var.m75939xb282bd08(1);
            }
            sb7.append(" " + b17 + " PBitRate:" + m75939xb282bd083 + '/' + longValue + "Bps");
            if (qVar2 == null || (rVar4 = qVar2.f419227i) == ni3.r.f419237e || rVar4 == ni3.r.f419242m) {
                str6 = "未启动";
                if (qVar2 == null || (rVar = qVar2.f419227i) == null || (str7 = rVar.f419251d) == null) {
                    ni3.r rVar5 = ni3.r.f419237e;
                    str7 = str6;
                }
                concat = "下载器：".concat(str7);
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                str6 = "未启动";
                java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(m75939xb282bd082 * ((((float) qVar2.f419231m) * 1.0f) / ((float) qVar2.f419232n)))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                sb8.append(format);
                sb8.append('/');
                sb8.append(m75939xb282bd082);
                sb8.append((char) 31186);
                java.lang.String sb9 = sb8.toString();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("下载器:");
                java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) qVar2.f419231m) * 100.0f) / ((float) qVar2.f419232n))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                sb10.append(format2);
                sb10.append("%  ");
                sb10.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(qVar2.f419231m));
                sb10.append('/');
                sb10.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(qVar2.f419232n));
                sb10.append(' ');
                sb10.append(sb9);
                sb10.append(' ');
                sb10.append(qVar2.f419227i.f419251d);
                concat = sb10.toString();
            }
            if (qVar2 == null || (rVar3 = qVar2.f419228j) == ni3.r.f419243n || rVar3 == ni3.r.f419249t || rVar3 == ni3.r.f419244o || rVar3 == ni3.r.f419245p) {
                if (qVar2 == null || (rVar2 = qVar2.f419228j) == null || (str9 = rVar2.f419251d) == null) {
                    ni3.r rVar6 = ni3.r.f419237e;
                    str8 = str6;
                } else {
                    str8 = str9;
                }
                concat2 = "播放器：".concat(str8);
            } else {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("播放器: ");
                java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((qVar2.f419229k * 100.0f) / ((float) qVar2.f419230l))}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
                sb11.append(format3);
                sb11.append("%  ");
                sb11.append(qVar2.f419229k);
                sb11.append('/');
                sb11.append(qVar2.f419230l);
                sb11.append("秒 ");
                sb11.append(qVar2.f419228j.f419251d);
                concat2 = sb11.toString();
            }
            sb7.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append(concat);
            sb7.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append(concat2);
            java.lang.String sb12 = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb12, "toString(...)");
            qVar = qVar2;
            j5Var = j5Var2;
            textView = textView2;
            sb6 = sb12;
            c16559xedc507d92 = c16559xedc507d93;
        } else {
            long mo2128x1ed62e842 = j5Var2.mo2128x1ed62e84();
            java.lang.String m75945x2fec83075 = c17.m75945x2fec8307(9);
            if (m75945x2fec83075 != null) {
                java.lang.String m75945x2fec83076 = c17.m75945x2fec8307(9);
                int length2 = m75945x2fec83076 != null ? m75945x2fec83076.length() : 0;
                int i38 = 5 > length2 ? length2 : 5;
                i18 = 0;
                charSequence = m75945x2fec83075.subSequence(0, i38);
            } else {
                i18 = 0;
                charSequence = null;
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(charSequence);
            int m75939xb282bd084 = c17.m75939xb282bd08(2);
            int i39 = qVar2 != null ? qVar2.f419220b : i18;
            if (qVar2 != null) {
                i19 = qVar2.f419221c;
                if (i19 == 0) {
                    i19 = qVar2.f419220b;
                }
            } else {
                i19 = 0;
            }
            int max = java.lang.Math.max(i39, i19);
            if (qVar2 != null) {
                i27 = qVar2.f419221c;
                if (i27 == 0) {
                    i27 = qVar2.f419220b;
                }
            } else {
                i27 = 0;
            }
            if (qVar2 != null) {
                str = "> ";
                j17 = qVar2.f419219a;
            } else {
                str = "> ";
                j17 = 0;
            }
            if (qVar2 != null) {
                str2 = "toString(...)";
                str3 = qVar2.f419223e;
            } else {
                str2 = "toString(...)";
                str3 = null;
            }
            if (qVar2 != null) {
                j18 = mo2128x1ed62e842;
                str4 = qVar2.f419224f;
            } else {
                j18 = mo2128x1ed62e842;
                str4 = null;
            }
            int i47 = qVar2 != null ? qVar2.f419225g : 0;
            long mo2128x1ed62e843 = j5Var2.mo2128x1ed62e84();
            int i48 = i47;
            long j27 = j17;
            java.lang.String b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9.b(c16559xedc507d94, j5Var2);
            boolean m59314x4d5c4d55 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).getFeedObject().m59314x4d5c4d55() : false;
            if (qVar2 != null) {
                str5 = str4;
                c16559xedc507d9 = c16559xedc507d94;
                j19 = qVar2.f419226h;
                j5Var = j5Var2;
            } else {
                str5 = str4;
                c16559xedc507d9 = c16559xedc507d94;
                j5Var = j5Var2;
                j19 = 0;
            }
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            if (mo2128x1ed62e843 != 0) {
                qVar = qVar2;
                sb13.append(str);
            } else {
                qVar = qVar2;
            }
            if (m59314x4d5c4d55) {
                sb13.append("[LV-" + i17 + '#' + obj + "] ");
            } else if (m75939xb282bd084 == 4) {
                sb13.append("[V-" + i17 + '#' + obj + "] ");
            } else if (m75939xb282bd084 == 2) {
                sb13.append("[P-" + i17 + '#' + obj + "] ");
            } else if (m75939xb282bd084 == 9) {
                sb13.append("[L-" + i17 + '#' + obj + "] ");
            } else {
                sb13.append("[?-" + i17 + '#' + obj + "] ");
            }
            sb13.append(valueOf2.concat(" "));
            c16559xedc507d92 = c16559xedc507d9;
            boolean z18 = c16559xedc507d92.f230990f;
            if (z18 && str3 != null) {
                sb13.append(str3);
            }
            if (!z18 && str5 != null) {
                sb13.append(" ".concat(str5));
            }
            if (m75939xb282bd084 == 4) {
                sb13.append(" " + max + "% (" + i27 + "%:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(j27) + ") ");
                if (j19 > 0) {
                    sb13.append("tc:" + j19);
                }
            } else {
                sb13.append("size=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i48));
            }
            sb13.append(" ".concat(b18));
            if (c16559xedc507d92.f230998q.contains(java.lang.Long.valueOf(j18))) {
                sb13.append(" (preload)");
            }
            sb6 = sb13.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, str2);
            textView = textView2;
        }
        textView.setText(sb6);
        int i49 = qVar != null ? qVar.f419222d : 0;
        if (c16559xedc507d92.f230994m == j5Var.mo2128x1ed62e84()) {
            textView.setTextColor(c16559xedc507d92.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            return;
        }
        if (i49 == 2) {
            textView.setTextColor(c16559xedc507d92.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        } else if (i49 == 3) {
            textView.setTextColor(c16559xedc507d92.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560054a2));
        } else {
            textView.setTextColor(c16559xedc507d92.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup p07, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cyg, p07, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new ni3.u(inflate);
    }
}
