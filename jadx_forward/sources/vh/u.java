package vh;

/* loaded from: classes12.dex */
public class u implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh.y f518354b;

    public u(vh.y yVar, int i17) {
        this.f518354b = yVar;
        this.f518353a = i17;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        vh.y yVar = this.f518354b;
        java.lang.String str = yVar.f518362e;
        ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) obj).getClass();
        java.util.List emptyList = java.util.Collections.emptyList();
        vh.x xVar = yVar.f518363f;
        if (xVar != null) {
            emptyList = xVar.a(emptyList);
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(5, this.f518353a);
        java.lang.String format = ((java.text.DateFormat) uh.c.f509202b.b()).format(calendar.getTime());
        java.util.ArrayList arrayList = new java.util.ArrayList(emptyList.size() + 1);
        if (emptyList.isEmpty()) {
            vh.g gVar = new vh.g();
            gVar.f518320d = "NO DATA";
            arrayList.add(0, gVar);
        } else {
            java.util.Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(0, yVar.c((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e) it.next()));
            }
        }
        vh.f fVar = new vh.f();
        fVar.f518319d = format;
        arrayList.add(0, fVar);
        int abs = java.lang.Math.abs(yVar.f518361d);
        int i17 = yVar.f518359b;
        if (abs >= i17) {
            vh.f fVar2 = new vh.f();
            fVar2.f518319d = "END";
            arrayList.add(fVar2);
            vh.g gVar2 = new vh.g();
            gVar2.f518320d = "Only keep last " + i17 + " days' data";
            arrayList.add(gVar2);
        }
        yVar.f518360c.post(new vh.v(yVar, arrayList));
    }
}
