package f42;

/* loaded from: classes9.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (str == null || !r26.i0.y(str, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListTouchListener", false) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onTouch") || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "(Landroid/view/View;Landroid/view/MotionEvent;)Z") || objArr == null || objArr.length < 2) {
            return;
        }
        java.lang.Object obj2 = objArr[1];
        if (obj2 instanceof android.view.MotionEvent) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.view.MotionEvent");
            if ((((android.view.MotionEvent) obj2).getAction() & 255) == 0) {
                a52.a.f83114i = false;
                ((java.util.ArrayList) a52.a.f83113h).clear();
                a52.a.d("temp_6");
            }
        }
    }
}
