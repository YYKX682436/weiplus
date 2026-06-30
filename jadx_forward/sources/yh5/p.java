package yh5;

/* loaded from: classes12.dex */
public final class p extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public fq.a f543974v;

    /* renamed from: w, reason: collision with root package name */
    public android.os.Bundle f543975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mf3.p apiCenter) {
        super(apiCenter, "CleanGallery.SourceLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new yh5.o(this));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2v, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.u7v);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.p314xaae8f345.mm.R.id.u7v)));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f543974v = new fq.a(relativeLayout, textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        return relativeLayout;
    }

    @Override // rf3.h
    public void b() {
        Y(this, yh5.m.f543971d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new yh5.n(this));
        a0();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        e0();
        a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        boolean z17;
        java.lang.CharSequence charSequence;
        long longValue;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        android.content.Context K = K();
        pf5.z zVar = pf5.z.f435481a;
        if (!(K instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) K).a(yh5.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.util.List list = ((yh5.g) a17).f543965d;
        int i17 = bindContext.f407651b;
        bw1.l lVar = (bw1.l) kz5.n0.a0(list, i17);
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanSourceLayer", "bind position=" + i17 + " media=null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.List list2 = lVar.f106357p;
        if (list2 == null || list2.isEmpty()) {
            java.lang.String[] strArr = new java.lang.String[1];
            java.lang.String str2 = lVar.f106346e;
            java.lang.String str3 = str2 != null ? str2 : "";
            z17 = false;
            strArr[0] = str3;
            bundle.putStringArray("u", strArr);
            bundle.putLongArray("m", new long[]{lVar.f106347f});
        } else {
            java.util.ArrayList arrayList = (java.util.ArrayList) list2;
            int size = arrayList.size() + 1;
            java.lang.String[] strArr2 = new java.lang.String[size];
            for (int i18 = 0; i18 < size; i18++) {
                if (i18 == 0) {
                    str = lVar.f106346e;
                    if (str != null) {
                        strArr2[i18] = str;
                    }
                    str = "";
                    strArr2[i18] = str;
                } else {
                    str = (java.lang.String) ((android.util.Pair) arrayList.get(i18 - 1)).first;
                    if (str != null) {
                        strArr2[i18] = str;
                    }
                    str = "";
                    strArr2[i18] = str;
                }
            }
            int size2 = arrayList.size() + 1;
            long[] jArr = new long[size2];
            for (int i19 = 0; i19 < size2; i19++) {
                if (i19 == 0) {
                    longValue = lVar.f106347f;
                } else {
                    java.lang.Object second = ((android.util.Pair) arrayList.get(i19 - 1)).second;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                    longValue = ((java.lang.Number) second).longValue();
                }
                jArr[i19] = longValue;
            }
            bundle.putStringArray("u", strArr2);
            bundle.putLongArray("m", jArr);
            z17 = false;
        }
        bundle.putInt("t", lVar.f106343b);
        this.f543975w = bundle;
        boolean z18 = bundle.containsKey("u") ? true : z17 ? true : z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanSourceLayer", "bind position=" + i17 + " hasJumpChat=" + z18);
        fq.a aVar = this.f543974v;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        aVar.f346922b.setVisibility(z18 ? z17 : 8);
        if (z18) {
            c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
            if (f8Var != null) {
                android.content.Context K2 = K();
                android.os.Bundle bundle2 = this.f543975w;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundle2);
                fq.a aVar2 = this.f543974v;
                if (aVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
                charSequence = ((yv1.b1) f8Var).Ri(K2, bundle2, aVar2.f346922b.getTextSize());
            } else {
                charSequence = null;
            }
            if (charSequence != null) {
                fq.a aVar3 = this.f543974v;
                if (aVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                    throw null;
                }
                aVar3.f346922b.setText(charSequence);
            }
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        fq.a aVar = this.f543974v;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.TextView jumpChatBtn = aVar.f346922b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpChatBtn, "jumpChatBtn");
        pf3.d.W(this, jumpChatBtn, null, 1, null);
        pf3.d.U(this, jumpChatBtn, null, new yh5.l(this), 1, null);
    }
}
