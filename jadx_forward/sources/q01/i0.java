package q01;

/* loaded from: classes9.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final q01.i0 f440827d = new q01.i0();

    public i0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.l it = (jz5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jz5.l lVar = (jz5.l) it.f384366d;
        sb6.append(((q01.h0) lVar.f384366d).f440823a);
        sb6.append(">>");
        sb6.append(((q01.h0) lVar.f384367e).f440823a);
        sb6.append('(');
        sb6.append(((q01.h0) lVar.f384367e).f440825c);
        sb6.append('-');
        sb6.append(((q01.h0) lVar.f384367e).f440826d);
        sb6.append(")=");
        sb6.append(((java.lang.Number) it.f384367e).longValue());
        sb6.append("ms");
        return sb6.toString();
    }
}
