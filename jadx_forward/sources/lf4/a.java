package lf4;

/* loaded from: classes4.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f399881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f399882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lf4.g gVar, java.util.List list) {
        super(0);
        this.f399881d = gVar;
        this.f399882e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae c18469x2e558eae = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae) this.f399881d.f399927d;
        c18469x2e558eae.getClass();
        java.util.List datas = this.f399882e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(datas, "datas");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAlbumUI", "onLoadFinish datas.size=" + datas.size());
        qf4.f fVar = c18469x2e558eae.f253404g;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryAlbumAdapter");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAlbumAdapter", "updateDatas");
        java.util.ArrayList arrayList = fVar.f444228h;
        arrayList.clear();
        arrayList.addAll(datas);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fVar.f444231n += ((qf4.h) it.next()).f444235b.size();
        }
        if (!datas.isEmpty()) {
            arrayList.add(new qf4.h(fVar.f444224d, new java.util.ArrayList()));
        }
        fVar.m8146xced61ae5();
        if (datas.isEmpty()) {
            android.widget.TextView textView = c18469x2e558eae.f253402e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryNoDataTv");
                throw null;
            }
            textView.setVisibility(0);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c18469x2e558eae.f253401d;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            c1163xf1deaba4.setVisibility(8);
        } else {
            android.widget.TextView textView2 = c18469x2e558eae.f253402e;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryNoDataTv");
                throw null;
            }
            textView2.setVisibility(8);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c18469x2e558eae.f253401d;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
                throw null;
            }
            c1163xf1deaba42.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
