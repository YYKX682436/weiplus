package bk1;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk1.p f102885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk1.w f102886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bk1.y f102887f;

    public v(bk1.p pVar, bk1.w wVar, bk1.y yVar) {
        this.f102885d = pVar;
        this.f102886e = wVar;
        this.f102887f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        android.widget.TextView textView = this.f102885d.f102878f;
        java.util.List list = this.f102887f.f102893b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.xf7) it.next()).f471590e);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        this.f102886e.getClass();
        if (strArr.length == 0) {
            str = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3z);
        } else {
            android.text.TextPaint paint = textView.getPaint();
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            java.lang.String string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572188a41);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572187a40);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            int length = strArr.length;
            int i17 = 0;
            java.lang.String str2 = null;
            while (true) {
                if (i17 >= length) {
                    str = str2;
                    break;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(paint);
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
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    sb6.append(format);
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
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
