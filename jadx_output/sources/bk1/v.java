package bk1;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.p f21352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk1.w f21353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk1.y f21354f;

    public v(bk1.p pVar, bk1.w wVar, bk1.y yVar) {
        this.f21352d = pVar;
        this.f21353e = wVar;
        this.f21354f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.widget.TextView textView = this.f21352d.f21345f;
        java.util.List list = this.f21354f.f21360b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.xf7) it.next()).f390057e);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        this.f21353e.getClass();
        if (strArr.length == 0) {
            str = textView.getContext().getString(com.tencent.mm.R.string.a3z);
        } else {
            android.text.TextPaint paint = textView.getPaint();
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.f490655a41);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = textView.getContext().getString(com.tencent.mm.R.string.f490654a40);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            int length = strArr.length;
            int i17 = 0;
            java.lang.String str2 = null;
            while (true) {
                if (i17 >= length) {
                    str = str2;
                    break;
                }
                kotlin.jvm.internal.o.d(paint);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int length2 = strArr.length - 1;
                boolean z17 = length2 != i17;
                for (int i18 = 0; i18 < i17; i18++) {
                    sb6.append(strArr[i18]);
                    sb6.append(string2);
                }
                sb6.append(strArr[i17]);
                if (z17) {
                    java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length2 - i17)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    sb6.append(format);
                }
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                int i19 = i17;
                int i27 = length;
                java.lang.String str3 = string2;
                if (!(new android.text.StaticLayout(sb7, paint, width, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1)) {
                    str = sb7;
                    break;
                }
                i17 = i19 + 1;
                length = i27;
                string2 = str3;
                str2 = sb7;
            }
            if (str2 != null) {
                str = str2;
            }
        }
        textView.setText(str);
    }
}
