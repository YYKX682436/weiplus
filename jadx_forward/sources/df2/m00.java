package df2;

/* loaded from: classes3.dex */
public final class m00 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312273m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f312274n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f312275o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312273m = "ShopVIPController";
        this.f312274n = kz5.p0.f395529d;
        this.f312275o = ae2.in.f85221a.a(ym5.f6.H1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.m00 r9, int r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.m00.Z6(df2.m00, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.m00 r11, int r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.m00.a7(df2.m00, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b7(df2.m00 m00Var) {
        android.view.ViewGroup m56779x33bfba91;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76 = m00Var.c7();
        android.graphics.Bitmap m82573x12501425 = c76 != null ? c76.m82573x12501425() : null;
        android.widget.ImageView imageView2 = (android.widget.ImageView) m00Var.m124231x4ff8c0f0(com.p314xaae8f345.mm.R.id.odl);
        if (imageView2 != null) {
            imageView2.setImageBitmap(m82573x12501425);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a d76 = m00Var.d7();
        if (d76 == null || (m56779x33bfba91 = d76.m56779x33bfba91()) == null || (imageView = (android.widget.ImageView) m56779x33bfba91.findViewById(com.p314xaae8f345.mm.R.id.odl)) == null) {
            return;
        }
        imageView.setImageBitmap(m82573x12501425);
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c7() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) m124231x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564586vc);
        if (c22789xd23e9a9b == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.G1));
        return c22789xd23e9a9b;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a d7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.g2w);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) parent;
        }
        return null;
    }

    /* renamed from: findViewById */
    public final android.view.View m124231x4ff8c0f0(int i17) {
        android.view.View d76 = d7();
        if (d76 == null) {
            d76 = (android.view.ViewGroup) S6(com.p314xaae8f345.mm.R.id.g2w);
        }
        if (d76 != null) {
            return d76.findViewById(i17);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a d76 = d7();
        if (d76 != null) {
            d76.m56781xa1160b3b(new df2.g00(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a d77 = d7();
        if (d77 != null) {
            d77.b();
        }
        if ((pluginLayout instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) pluginLayout : null) != null) {
            pm0.v.y(((mm2.f6) m56788xbba4bfc0(mm2.f6.class)).f410575p1, (p012xc85e97e9.p093xedfae76a.y) pluginLayout, new df2.k00(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f312273m, pluginLayout + " is not owner");
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f312274n = kz5.p0.f395529d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c76 = c7();
        if (c76 != null) {
            c76.n();
        }
    }
}
