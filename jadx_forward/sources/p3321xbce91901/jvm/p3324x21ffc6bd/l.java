package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class l extends p3321xbce91901.jvm.p3324x21ffc6bd.e implements p3321xbce91901.jvm.p3324x21ffc6bd.k, f06.g {

    /* renamed from: arity */
    private final int f72688x58c52dd;

    /* renamed from: flags */
    private final int f72689x5cfee87;

    public l(int i17) {
        this(i17, p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad, null, null, null, 0);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: computeReflected */
    public f06.c mo143942x5ea00da5() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391657a.a(this);
    }

    /* renamed from: equals */
    public boolean m143954xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p3321xbce91901.jvm.p3324x21ffc6bd.l) {
            p3321xbce91901.jvm.p3324x21ffc6bd.l lVar = (p3321xbce91901.jvm.p3324x21ffc6bd.l) obj;
            return mo9624xfb82e301().equals(lVar.mo9624xfb82e301()) && mo9626x3f6b0a02().equals(lVar.mo9626x3f6b0a02()) && this.f72689x5cfee87 == lVar.f72689x5cfee87 && this.f72688x58c52dd == lVar.f72688x58c52dd && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m143943x2404e5d7(), lVar.m143943x2404e5d7()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo9625x74f198fd(), lVar.mo9625x74f198fd());
        }
        if (obj instanceof f06.g) {
            return obj.equals(mo143933x38a78837());
        }
        return false;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.k
    /* renamed from: getArity */
    public int mo134417x7429f927() {
        return this.f72688x58c52dd;
    }

    /* renamed from: hashCode */
    public int m143955x8cdac1b() {
        return (((mo9625x74f198fd() == null ? 0 : mo9625x74f198fd().hashCode() * 31) + mo9624xfb82e301().hashCode()) * 31) + mo9626x3f6b0a02().hashCode();
    }

    @Override // f06.g
    /* renamed from: isExternal */
    public boolean mo128652x64310b15() {
        return mo143935xd3829966().mo128652x64310b15();
    }

    @Override // f06.g
    /* renamed from: isInfix */
    public boolean mo128653x7ae3ddc6() {
        return mo143935xd3829966().mo128653x7ae3ddc6();
    }

    @Override // f06.g
    /* renamed from: isInline */
    public boolean mo128654xe19a9463() {
        return mo143935xd3829966().mo128654xe19a9463();
    }

    @Override // f06.g
    /* renamed from: isOperator */
    public boolean mo128655xb2e1cfee() {
        return mo143935xd3829966().mo128655xb2e1cfee();
    }

    @Override // f06.c
    /* renamed from: isSuspend */
    public boolean mo128642x6f0de7b2() {
        return mo143935xd3829966().mo128642x6f0de7b2();
    }

    /* renamed from: toString */
    public java.lang.String m143956x9616526c() {
        f06.c mo143933x38a78837 = mo143933x38a78837();
        if (mo143933x38a78837 != this) {
            return mo143933x38a78837.toString();
        }
        if ("<init>".equals(mo9624xfb82e301())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo9624xfb82e301() + " (Kotlin reflection is not available)";
    }

    public l(int i17, java.lang.Object obj) {
        this(i17, obj, null, null, null, 0);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getReflected */
    public f06.g mo143935xd3829966() {
        f06.c mo143933x38a78837 = mo143933x38a78837();
        if (mo143933x38a78837 != this) {
            return (f06.g) mo143933x38a78837;
        }
        throw new xz5.b();
    }

    public l(int i17, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i18) {
        super(obj, cls, str, str2, (i18 & 1) == 1);
        this.f72688x58c52dd = i17;
        this.f72689x5cfee87 = i18 >> 1;
    }
}
