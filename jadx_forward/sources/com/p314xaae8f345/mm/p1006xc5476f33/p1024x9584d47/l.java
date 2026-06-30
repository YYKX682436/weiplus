package com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47;

/* loaded from: classes12.dex */
public class l implements gh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df f156232a;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df) {
        this.f156232a = activityC11503x9e50b8df;
    }

    @Override // gh5.a
    public void b(boolean z17) {
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.f156208p1;
            final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f156232a.f178030d;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.view.View findFocus;
                    boolean z18;
                    android.widget.EditText editText;
                    int selectionStart;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.f156208p1;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.this;
                    android.view.View focusedChild = c1163xf1deaba42.getFocusedChild();
                    if (focusedChild == null || (findFocus = focusedChild.findFocus()) == null) {
                        return;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42.getLayoutManager();
                    boolean z19 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31;
                    if (z19) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31) layoutManager).f178057x = false;
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    android.graphics.Rect rect = new android.graphics.Rect();
                    findFocus.getDrawingRect(rect);
                    if ((findFocus instanceof android.widget.EditText) && (selectionStart = (editText = (android.widget.EditText) findFocus).getSelectionStart()) >= 0 && editText.getLayout() != null) {
                        int lineForOffset = editText.getLayout().getLineForOffset(selectionStart);
                        int lineTop = editText.getLayout().getLineTop(lineForOffset);
                        int lineBottom = editText.getLayout().getLineBottom(lineForOffset);
                        rect.top = lineTop;
                        rect.bottom = lineBottom;
                    }
                    findFocus.requestRectangleOnScreen(rect, false);
                    if (z18 && z19) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1338xbb6ca34f.C13157x77477b31) layoutManager).f178057x = true;
                    }
                }
            });
        }
    }
}
