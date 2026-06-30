package r02;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 f449874d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 c13244xeb3e7387) {
        this.f449874d = c13244xeb3e7387;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13244xeb3e7387 c13244xeb3e7387 = this.f449874d;
        if (c13244xeb3e7387.f178919e.getText().equals(c13244xeb3e7387.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5v))) {
            c13244xeb3e7387.f178918d.setMaxLines(Integer.MAX_VALUE);
            c13244xeb3e7387.f178918d.setText(c13244xeb3e7387.f178920f.f178855k);
            c13244xeb3e7387.f178919e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hfw);
        } else {
            c13244xeb3e7387.f178918d.setMaxLines(2);
            c13244xeb3e7387.f178919e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c5v);
            c13244xeb3e7387.f178918d.post(new r02.y(c13244xeb3e7387));
        }
        o02.a.b(10, 1003, 0, 2, c13244xeb3e7387.f178920f.f178850f, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
