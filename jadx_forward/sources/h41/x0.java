package h41;

/* loaded from: classes11.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f360420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f360421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360422f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h41.y0 y0Var, java.util.ArrayList arrayList, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360420d = y0Var;
        this.f360421e = arrayList;
        this.f360422f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.x0(this.f360420d, this.f360421e, this.f360422f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h41.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.y0 y0Var = this.f360420d;
        boolean z17 = y0Var.f360434j;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "updateContacts: skip after released");
            return f0Var;
        }
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094 = y0Var.f360428b;
        if (c11202x49ad0094 != null) {
            java.lang.String[] usernames = (java.lang.String[]) this.f360421e.toArray(new java.lang.String[0]);
            f41.n a17 = h41.y0.a(y0Var, this.f360422f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SelectContactCard", "updateContacts " + kz5.z.d0(usernames, ",", null, null, 0, null, null, 62, null) + ", scene=" + a17);
            android.os.Bundle m7436x8619eaa0 = c11202x49ad0094.m7436x8619eaa0();
            if (m7436x8619eaa0 != null) {
                m7436x8619eaa0.putStringArray("usernames", usernames);
            }
            android.os.Bundle m7436x8619eaa02 = c11202x49ad0094.m7436x8619eaa0();
            if (m7436x8619eaa02 != null) {
                m7436x8619eaa02.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, a17.ordinal());
            }
            int ordinal = a17.ordinal();
            if (ordinal == 0) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pgg;
            } else if (ordinal == 1) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pgd;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pge;
            }
            ((android.widget.TextView) ((jz5.n) c11202x49ad0094.f153773m).mo141623x754a37bb()).setText(i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) c11202x49ad0094.f153774n).mo141623x754a37bb()).mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.open_voice_control.card.SlotContactItem>");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
            java.util.ArrayList arrayList = new java.util.ArrayList(usernames.length);
            for (java.lang.String str : usernames) {
                arrayList.add(new f41.r0(str));
            }
            c22848x6ddd90cf.E0(new java.util.ArrayList(arrayList));
            c22848x6ddd90cf.m8146xced61ae5();
            c11202x49ad0094.c().requestLayout();
        }
        return f0Var;
    }
}
