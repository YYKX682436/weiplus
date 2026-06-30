package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/GalleryTabFragment;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GalleryTabFragment extends com.tencent.mm.ui.vas.VASCommonFragment {
    @Override // com.tencent.mm.ui.vas.VASCommonFragment, com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI) {
            al5.f3 f3Var = this.f211121p;
            if (f3Var instanceof e33.f2) {
                kotlin.jvm.internal.o.e(f3Var, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.GalleryFolderProvider");
                ((com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI) activity).b7((e33.f2) f3Var);
            }
        }
    }
}
