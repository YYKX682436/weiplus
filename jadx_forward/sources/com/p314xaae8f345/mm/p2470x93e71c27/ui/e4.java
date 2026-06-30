package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class e4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c f272340d;

    public e4(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c) {
        this.f272340d = activityC19658x8101466c;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19658x8101466c activityC19658x8101466c = this.f272340d;
        if (action == 0) {
            activityC19658x8101466c.f271412o++;
        } else if (motionEvent.getAction() == 1) {
            if (activityC19658x8101466c.f271406f.f271376p.getVisibility() == 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe1933193 = activityC19658x8101466c.f271406f;
                c19652xe1933193.j();
                c19652xe1933193.setVisibility(8);
            }
            if (activityC19658x8101466c.f271406f.f271375o.getVisibility() == 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe19331932 = activityC19658x8101466c.f271406f;
                c19652xe19331932.i();
                c19652xe19331932.setVisibility(8);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19652xe1933193 c19652xe19331933 = activityC19658x8101466c.f271406f;
            c19652xe19331933.setVisibility(0);
            android.widget.ImageButton imageButton = c19652xe19331933.f271378r;
            if (imageButton != null) {
                imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
