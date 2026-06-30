package g95;

/* loaded from: classes9.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f351350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.HashSet hashSet) {
        super(1);
        this.f351350d = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        g15.a aVar = (g15.a) obj;
        if (aVar.k() == 11) {
            if (this.f351350d.contains(java.lang.Long.valueOf(aVar.l()))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
