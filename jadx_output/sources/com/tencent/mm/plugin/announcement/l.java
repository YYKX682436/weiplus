package com.tencent.mm.plugin.announcement;

/* loaded from: classes12.dex */
public class l implements gh5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.announcement.ChatroomNoticeUI f74699a;

    public l(com.tencent.mm.plugin.announcement.ChatroomNoticeUI chatroomNoticeUI) {
        this.f74699a = chatroomNoticeUI;
    }

    @Override // gh5.a
    public void b(boolean z17) {
        if (z17) {
            int i17 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
            final androidx.recyclerview.widget.RecyclerView recyclerView = this.f74699a.f96497d;
            if (recyclerView == null) {
                return;
            }
            recyclerView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.view.View findFocus;
                    boolean z18;
                    android.widget.EditText editText;
                    int selectionStart;
                    int i18 = com.tencent.mm.plugin.announcement.ChatroomNoticeUI.f74675p1;
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = androidx.recyclerview.widget.RecyclerView.this;
                    android.view.View focusedChild = recyclerView2.getFocusedChild();
                    if (focusedChild == null || (findFocus = focusedChild.findFocus()) == null) {
                        return;
                    }
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    boolean z19 = layoutManager instanceof com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager;
                    if (z19) {
                        ((com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager) layoutManager).f96524x = false;
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
                        ((com.tencent.mm.plugin.component.editor.adapter.EditorLinearLayoutManager) layoutManager).f96524x = true;
                    }
                }
            });
        }
    }
}
