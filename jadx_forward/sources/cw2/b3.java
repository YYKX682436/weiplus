package cw2;

/* loaded from: classes2.dex */
public final class b3 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c f305125d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c) {
        this.f305125d = c15181x7c9d924c;
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c = this.f305125d;
        cw2.h8 playInfo = c15181x7c9d924c.getPlayInfo();
        if (playInfo != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5 s5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s5.f206882a;
            mn2.g4 g4Var = playInfo.f305280c;
            java.lang.String m75945x2fec8307 = g4Var.f411535e.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            s5Var.a(m75945x2fec8307, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFirstFrameUpdate] videoView=");
            cw2.da videoView = c15181x7c9d924c.getVideoView();
            sb6.append(videoView != null ? java.lang.Integer.valueOf(videoView.hashCode()) : null);
            sb6.append(" mediaId=");
            sb6.append(playInfo.f305279b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCardMediaLayout", sb6.toString());
            ym5.a1.f(new cw2.g3(c15181x7c9d924c, "onFirstFrameDraw"));
            ec2.g m61317xe16f3d0b = c15181x7c9d924c.m61317xe16f3d0b();
            if (m61317xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                ((ec2.h) m61317xe16f3d0b).a(c14989xf862ae88.m59124x87980ca(), c14989xf862ae88.getDupFlag(), g4Var.f411535e, g4Var, j17);
            }
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void b(float f17) {
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        java.util.LinkedList m61309x339d0e08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c = this.f305125d;
        cw2.h8 playInfo = c15181x7c9d924c.getPlayInfo();
        if (playInfo != null) {
            ec2.g m61317xe16f3d0b = c15181x7c9d924c.m61317xe16f3d0b();
            if (m61317xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                ((ec2.h) m61317xe16f3d0b).c(m59124x87980ca, dupFlag, g4Var.f411535e, playInfo.f305282e, g4Var, playInfo.f305278a);
            }
            m61309x339d0e08 = c15181x7c9d924c.m61309x339d0e08();
            java.util.Iterator it = m61309x339d0e08.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).mo1058x4d9b9b30();
            }
        }
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        java.util.LinkedList m61309x339d0e08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15181x7c9d924c c15181x7c9d924c = this.f305125d;
        cw2.h8 playInfo = c15181x7c9d924c.getPlayInfo();
        if (playInfo != null) {
            ec2.g m61317xe16f3d0b = c15181x7c9d924c.m61317xe16f3d0b();
            if (m61317xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = playInfo.f305278a;
                long m59124x87980ca = c14989xf862ae88.m59124x87980ca();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.g4 g4Var = playInfo.f305280c;
                ((ec2.h) m61317xe16f3d0b).b(m59124x87980ca, dupFlag, g4Var.f411535e, playInfo.f305282e, g4Var, aVar);
            }
            m61309x339d0e08 = c15181x7c9d924c.m61309x339d0e08();
            java.util.Iterator it = m61309x339d0e08.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).mo1057x65d3157a();
            }
        }
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        if (waVar != null) {
            cu2.x xVar = cu2.x.f303982a;
            so2.i3 c17 = cu2.x.c(xVar, waVar.f305629c, false, false, false, 14, null);
            if (!c17.f68979x84cd6908) {
                c17.f68979x84cd6908 = true;
                java.lang.String field_mediaId = c17.f68981xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                so2.i3 c18 = cu2.x.c(xVar, field_mediaId, false, false, false, 14, null);
                c18.f68979x84cd6908 = true;
                xVar.i(field_mediaId, c18, false);
            }
            ec2.g m61317xe16f3d0b = this.f305125d.m61317xe16f3d0b();
            if (m61317xe16f3d0b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = waVar.f305632f;
                long m59127x5db1b11 = c14989xf862ae88.m59127x5db1b11();
                java.lang.String dupFlag = c14989xf862ae88.getDupFlag();
                mn2.j4 video = waVar.f305631e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(video, "video");
                ec2.f fVar = new ec2.f(6);
                fVar.f332498j = m59127x5db1b11;
                fVar.f332499k = dupFlag;
                fVar.f332494f = waVar.f305630d;
                fVar.f332495g = video;
                fVar.f332511w = aVar;
                ((ec2.h) m61317xe16f3d0b).f332515a.a(fVar);
            }
        }
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
    }

    @Override // cw2.fb
    public void x(r45.mb4 mb4Var, cw2.wa waVar, int i17, nk4.e eVar) {
    }
}
