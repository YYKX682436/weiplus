package mf3;

/* loaded from: classes12.dex */
public final class r extends mf3.a implements mf3.l, u3.q {
    public final android.view.View A;
    public final mf3.u B;
    public mf3.n C;
    public u3.u D;
    public java.lang.String E;
    public mf3.y F;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.View itemView, mf3.u mediaType) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        this.A = itemView;
        this.B = mediaType;
        this.E = "";
    }

    @Override // mf3.l
    public void F() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.F();
        }
    }

    @Override // u3.q
    public void a(u3.s sVar, float f17, float f18) {
        this.A.setTranslationX(f17);
    }

    @Override // mf3.l
    public void i() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        mf3.n nVar = this.C;
        if (nVar != null) {
            return nVar.l();
        }
        return null;
    }

    @Override // mf3.l
    public mg3.e o() {
        return this.F;
    }

    @Override // mf3.l
    /* renamed from: onPause */
    public void mo129547xb01dfb57() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.mo129547xb01dfb57();
        }
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.mo124474x57429eec();
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.q(f17);
        }
    }

    @Override // mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.mo129548x408b7293();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        this.E = bindContext.f407650a.mo2110x5db1b11();
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.t(bindContext);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        mf3.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        u3.v vVar = new u3.v();
        vVar.f505779i = 0.0f;
        vVar.a(0.8f);
        vVar.b(10000.0f);
        u3.r rVar = u3.s.f505750l;
        android.view.View itemView = this.A;
        u3.u uVar = new u3.u(itemView, rVar);
        uVar.f505769t = vVar;
        this.D = uVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mf3.p pVar = new mf3.p(context);
        if (this.C == null) {
            mf3.m mVar = (mf3.m) pVar.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(mf3.m.class));
            android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.shc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            this.G = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28) findViewById;
            mf3.u uVar2 = this.B;
            if (mVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                android.content.Context context2 = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                nVar = mVar.O0(context2, pVar, uVar2);
            } else {
                nVar = null;
            }
            this.C = nVar;
            if (nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.MediaBaseViewHolder", "create layerDelegate error, factory: " + mVar + " mediaType: " + uVar2);
            }
            mf3.n nVar2 = this.C;
            if (nVar2 != null) {
                nVar2.p(z());
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f28 = this.G;
                if (c16495xfae9f28 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                nVar2.u(c16495xfae9f28);
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f282 = this.G;
                if (c16495xfae9f282 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                c16495xfae9f282.m66601x534b960f(nVar2);
                lf3.j jVar = (lf3.j) pVar.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(lf3.j.class));
                com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16495xfae9f28 c16495xfae9f283 = this.G;
                if (c16495xfae9f283 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interceptorLayout");
                    throw null;
                }
                this.F = new mf3.y(c16495xfae9f283, nVar2, jVar);
                f06.d api = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(mf3.o.class);
                mf3.y yVar = this.F;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
                pVar.d(xz5.a.b(api), yVar);
            }
        }
    }

    public final java.lang.String z() {
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
        return hexString;
    }
}
