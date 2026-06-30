package fm3;

/* loaded from: classes10.dex */
public final class l implements fm3.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f345618a;

    /* renamed from: b, reason: collision with root package name */
    public long f345619b;

    /* renamed from: c, reason: collision with root package name */
    public long f345620c;

    public l(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObj) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f345618a = finderObj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderObj.m76802x2dd01666();
        this.f345619b = ((m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? 0 : c19788xd7cfd73e.m76629x36bbd779()) * 1000;
    }

    @Override // fm3.o
    public void a(long j17) {
        this.f345620c = j17;
    }

    @Override // fm3.o
    public boolean b() {
        return false;
    }

    @Override // fm3.o
    public void c(long j17) {
        this.f345619b = j17;
    }

    @Override // fm3.o
    public long d() {
        return this.f345620c;
    }

    @Override // fm3.o
    public dk4.a e() {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f345618a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            return null;
        }
        java.lang.String str = "video_" + c19792x256d2725.m76784x5db1b11();
        ll3.i1 i1Var = ll3.i1.f400715a;
        java.lang.String c17 = i1Var.c(str);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int m76632x755bd410 = (int) c19788xd7cfd73e.m76632x755bd410();
        int m76605x1c4fb41d = (int) c19788xd7cfd73e.m76605x1c4fb41d();
        ((cf0.q) qVar).getClass();
        android.os.Bundle a17 = ck4.c.f124081a.a(context, m76632x755bd410, m76605x1c4fb41d);
        a17.getInt("width", 0);
        a17.getInt("height", 0);
        java.lang.String m76625xb5887639 = c19788xd7cfd73e.m76625xb5887639();
        dk4.a aVar = new dk4.a(str, c17, m76625xb5887639 == null ? "" : m76625xb5887639, (int) c19788xd7cfd73e.m76632x755bd410(), (int) c19788xd7cfd73e.m76605x1c4fb41d());
        aVar.f315997a = 2;
        aVar.f315998b = "xV2";
        java.lang.String m76628xfece4473 = c19788xd7cfd73e.m76628xfece4473();
        aVar.f315999c = m76628xfece4473 != null ? m76628xfece4473 : "";
        aVar.f316000d = c19788xd7cfd73e.m76588x1e2296db();
        aVar.f316003g = c19788xd7cfd73e.m76629x36bbd779() * 1000;
        aVar.f316004h = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
        sb6.append(c19792x256d2725.m76784x5db1b11());
        aVar.f316006j = i1Var.b(sb6.toString());
        return aVar;
    }

    @Override // fm3.o
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f() {
        return this.f345618a;
    }

    @Override // fm3.o
    /* renamed from: getDurationMs */
    public long mo129780x37a7fa50() {
        return this.f345619b;
    }
}
