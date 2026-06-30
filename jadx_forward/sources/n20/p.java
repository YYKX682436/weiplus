package n20;

/* loaded from: classes9.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 f415765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218) {
        super(0);
        this.f415765d = c10554x8fea218;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218 = this.f415765d;
        k20.g gVar = c10554x8fea218.f147459g;
        if (gVar != null) {
            em.e0 vb6 = c10554x8fea218.getVb();
            if (vb6.f335808j == null) {
                vb6.f335808j = (android.widget.TextView) vb6.f335799a.findViewById(com.p314xaae8f345.mm.R.id.f568941vh3);
            }
            android.widget.TextView textView = vb6.f335808j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "getTvFeedBack(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tj) gVar).a(textView);
        }
        return jz5.f0.f384359a;
    }
}
