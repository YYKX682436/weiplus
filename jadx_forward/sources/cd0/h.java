package cd0;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 f122067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755) {
        super(0);
        this.f122067d = c10677xd5472755;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.util.List keyList = com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755.f149322q;
        com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755 = this.f122067d;
        c10677xd5472755.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyList, "keyList");
        java.lang.String stringExtra = c10677xd5472755.m158359x1e885992().getStringExtra("KEY_CLICK_MSG_TALKER");
        if (!(stringExtra == null || r26.n0.N(stringExtra))) {
            return stringExtra;
        }
        java.util.Iterator it = keyList.iterator();
        do {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            android.os.Bundle extras = c10677xd5472755.m158359x1e885992().getExtras();
            java.lang.Object obj = extras != null ? extras.get(str2) : null;
            if ((obj instanceof java.lang.String) && !r26.n0.N((java.lang.CharSequence) obj)) {
                str = (java.lang.String) obj;
            }
        } while (!(!r26.n0.N(str)));
        return str;
    }
}
