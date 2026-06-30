package yt3;

/* loaded from: classes10.dex */
public class s3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f547200d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547201e;

    /* renamed from: f, reason: collision with root package name */
    public int f547202f;

    public s3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547200d = view;
        this.f547201e = status;
        view.setOnClickListener(this);
        view.m82040x7541828(-1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f547200d;
        if (c22699x3dcdb352.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) {
            android.content.Context context = c22699x3dcdb352.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) context).Z6();
        }
        ju3.d0.k(this.f547201e, ju3.c0.f383422n, null, 2, null);
        nu3.i iVar = nu3.i.f421751a;
        iVar.d(3);
        iVar.b(3);
        iVar.i(this.f547202f);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547200d.setVisibility(i17);
    }
}
