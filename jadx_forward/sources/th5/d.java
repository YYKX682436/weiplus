package th5;

/* loaded from: classes12.dex */
public final class d extends rf3.u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mf3.p apiCenter) {
        super(apiCenter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f476542v = new th5.c(this);
    }

    @Override // rf3.u, sf3.l
    public void f(sf3.k state, sf3.g param, mf3.w level) {
        mf3.k kVar;
        mf3.k kVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        mf3.s sVar = this.f407643m;
        java.lang.String str = null;
        java.lang.String mo2110x5db1b11 = (sVar == null || (kVar2 = sVar.f407650a) == null) ? null : kVar2.mo2110x5db1b11();
        java.lang.String str2 = param.f488921b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, mo2110x5db1b11)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStateChanged apply abort. callback id: ");
            sb6.append(str2);
            sb6.append(", bind id: ");
            mf3.s sVar2 = this.f407643m;
            if (sVar2 != null && (kVar = sVar2.f407650a) != null) {
                str = kVar.mo2110x5db1b11();
            }
            sb6.append(str);
            P(sb6.toString(), new java.lang.Object[0]);
            return;
        }
        Q("onImageStateChanged: id:" + str2 + " path:" + param.c() + ", state: " + state.name(), new java.lang.Object[0]);
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            V(param);
            return;
        }
        if (ordinal == 2) {
            if (level != mf3.w.f407662e) {
                V(param);
                return;
            }
            return;
        }
        if (ordinal == 3) {
            U(param);
            Q("onImageParserSuccess, start preScan: " + param.c(), new java.lang.Object[0]);
            Y(param.c());
            return;
        }
        if (ordinal == 4) {
            java.lang.String string = K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p_u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            W(string, param);
        } else {
            if (ordinal == 5) {
                U(param);
                return;
            }
            java.lang.String string2 = K().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fjg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            rf3.u.X(this, string2, null, 2, null);
        }
    }

    @Override // rf3.u, ml5.g
    /* renamed from: onScroll */
    public void mo68312x58dabd8c(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16496x621920fa c17 = S().c();
        float translationX = c17.getTranslationX() + f17;
        float translationY = c17.getTranslationY() + f18;
        c17.setTranslationX(0.0f);
        c17.setTranslationY(0.0f);
        jz5.l B = c17.B(translationX, translationY);
        c17.setTranslationX(c17.getTranslationX() + ((java.lang.Number) B.f384366d).floatValue());
        c17.setTranslationY(c17.getTranslationY() + ((java.lang.Number) B.f384367e).floatValue());
    }
}
