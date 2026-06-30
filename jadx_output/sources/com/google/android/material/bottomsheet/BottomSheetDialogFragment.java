package com.google.android.material.bottomsheet;

/* loaded from: classes14.dex */
public class BottomSheetDialogFragment extends androidx.appcompat.app.AppCompatDialogFragment {
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        return new y9.i(getContext(), getTheme());
    }
}
