package fm3;

/* loaded from: classes10.dex */
public final class k implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f345614a;

    public k(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f345614a = finderObj;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbView, "thumbView");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f345614a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423615f = ll3.i1.f400715a.b("thumb_" + c19792x256d2725.m76784x5db1b11());
        fVar.f423611b = true;
        fVar.f423610a = true;
        n11.a.b().i(c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca(), thumbView, fVar.a(), new fm3.j(aVar));
    }
}
