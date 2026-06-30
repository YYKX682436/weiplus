package nz4;

/* loaded from: classes12.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423161d;

    public m(nz4.y yVar) {
        this.f423161d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nz4.y yVar = this.f423161d;
        nz4.h hVar = yVar.f423198w;
        hz4.h hVar2 = ((hz4.f) hz4.f.wi()).f367940d;
        if (hVar2 != null) {
            java.lang.String h17 = hVar2.h();
            hz4.i iVar = hVar2.f367951i;
            java.lang.String a17 = iVar.a(h17);
            boolean g17 = hVar2.g();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3 c6447xbd8a5a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6447xbd8a5a3();
            c6447xbd8a5a3.f137877d = 15;
            c6447xbd8a5a3.f137879f = c6447xbd8a5a3.b("noteid", a17, true);
            c6447xbd8a5a3.f137880g = g17 ? 1 : 0;
            c6447xbd8a5a3.f137878e = c6447xbd8a5a3.b("sessionID", iVar.f367958a, true);
            c6447xbd8a5a3.k();
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                java.lang.String n17 = c6447xbd8a5a3.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteReporter", "report%s %s", 14547, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
            }
        }
        lz4.a aVar = yVar.f423197v;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).n7();
        }
        lz4.a aVar2 = yVar.f423197v;
        mz4.d dVar = aVar2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar2).J1 : null;
        if (dVar != null) {
            if (dVar.f414771j) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.RunnableC29168x2e00fe(dVar));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.RunnableC29170x2e0100(dVar));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new mz4.RunnableC29174x2e0104(dVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
