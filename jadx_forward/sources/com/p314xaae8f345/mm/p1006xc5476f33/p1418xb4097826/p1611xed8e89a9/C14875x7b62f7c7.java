package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileUIFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderReportFragment;", "Lrd2/c;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileUIFragment */
/* loaded from: classes2.dex */
public final class C14875x7b62f7c7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15132xa540658a implements rd2.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f204828n = kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4.class, pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.m8.class)), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.d6.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h.class, sr2.l5.class, hy2.f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.class});

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15132xa540658a, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0, reason: from getter */
    public java.util.Set getF204828n() {
        return this.f204828n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15132xa540658a
    public int s0() {
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String string = m7436x8619eaa0 != null ? m7436x8619eaa0.getString("finder_username") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        boolean z17 = false;
        java.lang.Boolean valueOf = m7436x8619eaa02 != null ? java.lang.Boolean.valueOf(m7436x8619eaa02.getBoolean("KEY_FINDER_SELF_FLAG", false)) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        boolean booleanValue = valueOf.booleanValue();
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, mo7438x76847179 != null ? xy2.c.e(mo7438x76847179) : null) && booleanValue) {
            z17 = true;
        }
        return z17 ? 33 : 32;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15132xa540658a
    public int t0() {
        return 3;
    }
}
