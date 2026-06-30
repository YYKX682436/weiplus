package x0;

/* loaded from: classes14.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f532451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(x0.r0 r0Var) {
        super(0);
        this.f532451d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        o0.i iVar = this.f532451d.f532468d;
        int i17 = iVar.f423385f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f423383d;
            int i18 = 0;
            do {
                x0.n0 n0Var = (x0.n0) objArr[i18];
                java.util.HashSet hashSet = n0Var.f532448c;
                if (!hashSet.isEmpty()) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        n0Var.f532446a.mo146xb9724478(it.next());
                    }
                    hashSet.clear();
                }
                i18++;
            } while (i18 < i17);
        }
        return jz5.f0.f384359a;
    }
}
