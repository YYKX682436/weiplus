package ev0;

/* loaded from: classes9.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10934x3bcf5a17 f338418d;

    public v(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10934x3bcf5a17 c10934x3bcf5a17) {
        this.f338418d = c10934x3bcf5a17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/music/MusicPickerVolumePanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f338418d.a();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/music/MusicPickerVolumePanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
