package or0;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428961d;

    public b(java.lang.String str) {
        this.f428961d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = or0.c.f428964c;
        if (textView == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f428961d);
        sb6.append('\n');
        or0.e eVar = or0.c.f428967f;
        sb6.append("平均帧率:" + eVar.f428979b.f428977d + "\n实时帧率:" + eVar.f428980c);
        textView.setText(sb6.toString());
    }
}
