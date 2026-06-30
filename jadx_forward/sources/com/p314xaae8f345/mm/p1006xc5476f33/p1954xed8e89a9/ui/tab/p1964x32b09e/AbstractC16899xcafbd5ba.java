package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabCommonFragment;", "Lwr3/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment */
/* loaded from: classes11.dex */
public abstract class AbstractC16899xcafbd5ba<T extends wr3.f0> extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657 {

    /* renamed from: p, reason: collision with root package name */
    public final boolean f235959p;

    /* renamed from: q, reason: collision with root package name */
    public final int f235960q;

    /* renamed from: r, reason: collision with root package name */
    public final sr3.g f235961r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f235962s;

    /* renamed from: t, reason: collision with root package name */
    public long f235963t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f235964u;

    /* renamed from: v, reason: collision with root package name */
    public wr3.f0 f235965v;

    public AbstractC16899xcafbd5ba(boolean z17, int i17, sr3.g config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f235959p = z17;
        this.f235960q = i17;
        this.f235961r = config;
        this.f235962s = new java.util.LinkedList();
    }

    public void A0(java.util.List msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
    }

    public void B0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 dataFetcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataFetcher, "dataFetcher");
        this.f235945e = dataFetcher;
        C0();
        dataFetcher.f235815m.mo7806x9d92d11c(this, new wr3.h0(this));
        y0(dataFetcher, new wr3.i0(this));
        dataFetcher.f235821s.mo7806x9d92d11c(this, new wr3.j0(this));
        dataFetcher.f235822t.mo7806x9d92d11c(this, new wr3.k0(this));
        p012xc85e97e9.p093xedfae76a.j0 w07 = w0(dataFetcher);
        if (w07 != null) {
            w07.mo7806x9d92d11c(this, new wr3.l0(this, dataFetcher));
        }
    }

    public void C0() {
    }

    public abstract void F0(r45.wl wlVar, r45.tj6 tj6Var);

    public abstract boolean G0(vr3.h hVar);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r6 != null && r6.f468986e == 0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(java.util.List r4, java.util.LinkedList r5, r45.ul r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r3 = this;
            java.lang.String r8 = "msgList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r8)
            java.lang.String r8 = "footerWording"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r8)
            boolean r7 = r4.isEmpty()
            r8 = 1
            r7 = r7 ^ r8
            java.util.LinkedList r0 = r3.f235962s
            r1 = 0
            if (r7 != 0) goto L1f
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r8
            if (r7 == 0) goto L1d
            goto L1f
        L1d:
            r7 = r1
            goto L20
        L1f:
            r7 = r8
        L20:
            wr3.f0 r2 = r3.r0()
            if (r7 == 0) goto L32
            if (r6 == 0) goto L2e
            int r7 = r6.f468986e
            if (r7 != 0) goto L2e
            r7 = r8
            goto L2f
        L2e:
            r7 = r1
        L2f:
            if (r7 == 0) goto L32
            goto L33
        L32:
            r8 = r1
        L33:
            boolean r7 = r2.f530321w
            if (r7 != r8) goto L38
            goto L49
        L38:
            r2.f530321w = r8
            int r7 = r2.mo1894x7e414b06()
            if (r7 <= 0) goto L49
            java.util.ArrayList r7 = r2.f530319u
            int r7 = r7.size()
            r2.m8147xed6e4d18(r7)
        L49:
            wr3.f0 r7 = r3.r0()
            r7.f530320v = r6
            java.util.ArrayList r6 = r7.f530319u
            r6.clear()
            java.util.List r4 = r7.M(r4, r5, r0)
            r6.addAll(r4)
            r7.m8146xced61ae5()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16899xcafbd5ba.H0(java.util.List, java.util.LinkedList, r45.ul, java.lang.String, java.lang.Integer):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.AbstractC16894x4f59e657, zy2.h5
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        z0(r0());
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        r45.tj6 t07 = t0(m0());
        r45.ul ulVar = null;
        java.util.List list = (t07 == null || (glVar4 = t07.f468042e) == null) ? null : glVar4.f456856d;
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        r45.tj6 t08 = t0(m0());
        java.util.LinkedList linkedList = (t08 == null || (glVar3 = t08.f468042e) == null) ? null : glVar3.f456860h;
        r45.tj6 t09 = t0(m0());
        java.lang.Integer valueOf = (t09 == null || (glVar2 = t09.f468042e) == null) ? null : java.lang.Integer.valueOf(glVar2.f456861i);
        r45.tj6 t010 = t0(m0());
        if (t010 != null && (glVar = t010.f468042e) != null) {
            ulVar = glVar.f456859g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b.c(m0(), mo7438x76847179());
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String str = c17;
        if (!list.isEmpty()) {
            H0(list, linkedList, ulVar2, str, valueOf);
            A0(list);
        }
        r0().f530348e = new wr3.g0(this);
    }

    public abstract java.util.ArrayList q0(r45.wl wlVar);

    public final wr3.f0 r0() {
        wr3.f0 f0Var = this.f235965v;
        if (f0Var != null) {
            return f0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
        throw null;
    }

    /* renamed from: s0 */
    public abstract java.lang.String getF235954w();

    public abstract r45.tj6 t0(r45.wl wlVar);

    public abstract java.lang.String u0();

    public abstract p012xc85e97e9.p093xedfae76a.j0 w0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7);

    public abstract void x0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar);

    public abstract void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7, p012xc85e97e9.p093xedfae76a.k0 k0Var);

    public void z0(wr3.f0 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
    }
}
